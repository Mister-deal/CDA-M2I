import express from 'express'
import { Client } from '../classes/Client';
import  ClientDao  from '../dao/ClientDao';


const clients = express.Router();
clients.use(express.json())
const clientDao = new ClientDao();
clientDao.readFile()


clients.get('/clients', (req, res) =>{
    res.send(clientDao.getAll());
})

clients.get('/clients/:clientId', (req, res) =>{
    let client =  clientDao.findById(req.params.clientId);
    if(client == undefined) {
        res.status(404).json({code: 404, message: "aucun client trouvé avec cette id"});
    }
    res.json(client)
})

clients.post('/clients', (req, res) =>{
    const {nom, prenom, telephone} = req.body;
    let client = new Client(null, nom, prenom, telephone);
    res.json(clientDao.save(client));
})