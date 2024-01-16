
use("demo");
//db.books.find();

// Read : 

// recherche id 45:
//db.books.find({_id: 45});

// -- limiter à 5
//db.books.find().limit(5);

// -- avec 2 auteurs
//db.books.find({authors: {$size:2}});

// -- nombre de page egal à 400 et plus
//db.books.find({pageCount: {$gte: 400}});

// -- id == 55, 75 et 120
// db.books.find({_id: {$in: [55,75,120]}});

// -- avec 2 auteurs, tri par titre et puis _id
// db.books.find({authors: {$size: 2}}).sort({title:1, _id:-1});

// -- -- avec 2 auteurs, tri par titre, puis _id et les 3 premiers
//db.books.find({authors: {$size: 2}}).skip(10).sort({title:1, _id:-1}).limit(3);

// -- les livres entre 26 et 49 au niveau de l'id
//db.books.find({$and: [{_id: {$gt:25}},{_id: {$lt: 50}}]}).count();

// -- affiche l'id et le tableau d'auteur des livres avec id supérieur à 45
// db.books.find({_id: {$gt: 45}}, {_id:1, authors:1});

// -- affiche tout sauf le tableau d'auteur des livres avec id supérieur à 45
// db.books.find({_id: {$gt: 45}}, {authors:0});

// -- compris dans le tableau 
//db.books.find({categories: {$in : ['Java', 'Web Development']}});

// -- Les deux informations
//db.books.find({categories: {$all : ['Java', 'Web Development']}});

// -- l'un ou l'autre
//db.books.find({$or: [{_id: 19},{_id: 80}]});

// -- commence par ext ou Ext ou EXT => i : insensible à la casse
//db.books.find({longDescription: {$regex: "^ext", $options:"i"}})

// -- contient Distributed ou distributed
// db.books.find({longDescription: {$regex: "Distributed", $options:"i"}})

//-- Fin avec Perl (rien derrière Perl ou perl)
//db.books.find({title: {$regex: "Perl$", $options:"i"}})

