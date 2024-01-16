use("demo");
//db.products.insertOne({name :"Iphone", price : 1250});
//db.createCollection("notes");
//db.notes.insertMany({matiere: "java", date: new Date(2015/5/21), note: 15});
//db.notes.find();

//crud
//insertion ou creation

// db.products.insertOne({nom: "table", dimension: 15*15*30*30, poids: 100, prix: 50});
// db.products.insertOne({nom: "table", dimension: 15*15*30*30, poids: 100, prix: 55});
// db.products.insertMany([{nom: "table", dimension: 15*15*30*30, poids: 100, prix: 35},{nom: "table-basse", dimension: 15*15*30*30, poids: 50, prix: 25},{nom: "armoire", dimension: 15*15*30*30, poids: 100, couleur: ["rouge", "noir", "beige"], prix: 35}]);

// db.products.insertOne({
//     _id: 2500, name: "Avion bi-moteur", carburant: "kerosène"
// });
db.products.find();