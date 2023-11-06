const express = require('express');
const bodyParser = require('body-parser');
const csv = require('csv-parser');
const fs = require('fs');
const morgan = require('morgan');
const app = express();
const { v4: uuidv4 } = require('uuid');

app.use(bodyParser.json());
app.use(morgan('combined')); // Middleware pour le logging des requêtes

const contactsFilePath = 'contacts.csv';

// Middleware d'authentification
function authenticate(req, res, next) {
    const authToken = req.headers.authorization;

    if (!authToken || authToken !== 'MonTokenSecret') {
        return res.status(401).json({ message: 'Unauthorized' });
    }
    next();
}

// Middleware de logging de la date
function logDate(req, res, next) {
    console.log(`Request received at: ${new Date()}`);
    next();
}

// Endpoint pour ajouter un contact
app.post('/contacts', authenticate, logDate, (req, res) => {
    const { nom, prenom, telephone, email } = req.body;
    const contactId = uuidv4(); // Générer un nouvel ID de contact (par exemple, utilisez un package comme uuid)

    // Créer un nouvel objet contact avec les données du corps de la requête
    const newContact = {
        id: contactId,
        nom: nom,
        prenom: prenom,
        telephone: telephone,
        email: email
    };

    // Écrire le nouveau contact dans le fichier CSV
    const csvStream = fs.createWriteStream(contactsFilePath, { flags: 'a' });
    csvStream.write(`${contactId},${nom},${prenom},${telephone},${email}\n`);
    csvStream.end();

    res.status(201).send('Contact ajouté avec succès.');
});

// Endpoint pour récupérer la liste des contacts
app.get('/contacts', logDate, (req, res) => {
    const contacts = [];

    // Lire les contacts à partir du fichier CSV
    fs.createReadStream(contactsFilePath)
        .pipe(csv())
        .on('data', (row) => {
            contacts.push(row);
        })
        .on('end', () => {
            res.status(200).json(contacts);
        });
});

// Endpoint pour récupérer un contact par son ID
app.get('/contacts/:id', logDate, (req, res) => {
    const contactId = req.params.id;
    const contacts = [];

    // Lire les contacts à partir du fichier CSV et trouver le contact par ID
    fs.createReadStream(contactsFilePath)
        .pipe(csv())
        .on('data', (row) => {
            if (row.id === contactId) {
                res.status(200).json(row);
            }
        })
        .on('end', () => {
            res.status(404).send('Contact non trouvé.');
        });
});

// Endpoint pour modifier un contact par son ID
app.put('/contacts/:id', authenticate, logDate, (req, res) => {
    const contactId = req.params.id;

    // Lire les contacts à partir du fichier CSV et trouver le contact par ID
    const contacts = [];
    fs.createReadStream(contactsFilePath)
        .pipe(csv())
        .on('data', (row) => {
            if (row.id === contactId) {
                // Mettez à jour les propriétés du contact
                row.nom = req.body.nom || row.nom;
                row.prenom = req.body.prenom || row.prenom;
                row.telephone = req.body.telephone || row.telephone;
                row.email = req.body.email || row.email;
            }
            contacts.push(row);
        })
        .on('end', () => {
            // Écrire les contacts mis à jour dans le fichier CSV
            const csvStream = fs.createWriteStream(contactsFilePath);
            contacts.forEach((contact) => {
                csvStream.write(`${contact.id},${contact.nom},${contact.prenom},${contact.telephone},${contact.email}\n`);
            });
            csvStream.end();
            res.status(200).send('Contact modifié avec succès.');
        });
});

// Endpoint pour supprimer un contact par son ID
app.delete('/contacts/:id', authenticate, logDate, (req, res) => {
    const contactId = req.params.id;

    // Lire les contacts à partir du fichier CSV et filtrer le contact par ID
    const contacts = [];
    fs.createReadStream(contactsFilePath)
        .pipe(csv())
        .on('data', (row) => {
            if (row.id !== contactId) {
                contacts.push(row);
            }
        })
        .on('end', () => {
            // Écrire les contacts filtrés dans le fichier CSV
            const csvStream = fs.createWriteStream(contactsFilePath);
            contacts.forEach((contact) => {
                csvStream.write(`${contact.id},${contact.nom},${contact.prenom},${contact.telephone},${contact.email}\n`);
            });
            csvStream.end();
            res.status(200).send('Contact supprimé avec succès.');
        });
});

const PORT = 3000;
app.listen(PORT, () => {
    console.log(`Server is running on port: http://127.0.0.1:${PORT}`);
});
