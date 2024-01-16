use("demo");
// db.books.find();

//read


//recherche id précie
// db.books.find({
//     _id: 45
// });

// limiter à 5 la recherche
// db.books.find().limit(5);

//avec 2 auteurs
// db.books.find({authors: {$size:2}});

//nombre de page egal à 400 et plus
// db.books.find({pageCount: {$gte: 400}});


// recherche d'id spécifiques
// db.books.find({_id: {$in: [55, 75, 120]}});

//recherche des livres avec 2 auteurs, avec une limite de 3 livres, tri par titre, puis _id

// db.books.find({authors: {$size: 2}}).skip(10).sort({title:1, _id:-1}).limit(3);


//  db.books.find({$and: [{_id: {$gt:25}}, {_id: {$lt: 50}}]}).count();
db.books.find({_id:{$gt: 45}},{_id: 1, authors:1});
