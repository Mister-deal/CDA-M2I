use("tp");
//exo 1

// db.products.insertMany([{
//     nom: "mohamed",
//      prenom: "hichem",
//        age: 42,
//         historique : [
//     {
//         maladie: "rhume",
//         traitement: "sirop"
//     }
// ]},
// {
//     nom: "jospin",
//      prenom: "remi",
//        age: 23,
//         historique : [
//     {
//         maladie: "grippe",
//         traitement: "antibiotique"
//     }
// ]},
// {
//     nom: "morvan",
//      prenom: "maxime",
//        age: 29,
//         historique : [
//     {
//         maladie: "rhinite",
//         traitement: "sirop"
//     }
// ]},
// {
//     nom: "momo",
//      prenom: "damien",
//        age: 35,
//         historique : [
//     {
//         maladie: "rhume",
//         traitement: "sirop"
//     }
// ]},
// {
//     nom: "moha",
//      prenom: "didier",
//        age: 41,
//         historique : [
//     {
//         maladie: "rhume",
//         traitement: "sirop"
//     }
// ]},
// {
//     nom: "sarko",
//      prenom: "nico",
//        age: 42,
//         historique : [
//     {
//         maladie: "bronchite",
//         traitement: "anti-tussif"
//     }
// ]},
// {
//     nom: "julia",
//      prenom: "michelle",
//        age: 37,
//         historique : [
//     {
//         maladie: "grippe",
//         traitement: "sirop et antibiotique"
//     }
// ]},
// {
//     nom: "matrixe",
//      prenom: "françois",
//        age: 47,
//         historique : [
//     {
//         maladie: "crise urticaire",
//         traitement: "crème"
//     }
// ]},
// {
//     nom: "blablir",
//      prenom: "azov",
//        age: 56,
//         historique : [
//     {
//         maladie: "gastro",
//         traitement: "suppo"
//     }
// ]}]);
// db.products.find();
// db.products.find({nom: "mike"});

// exo 2
// db.products.updateOne(
//     { nom: "michael" },
//     {
//       $set: {
//         nom: "aijjou",
//         prenom: "mohamed",
//         age: 32,
//         historique: [
//           {
//             maladie: "douleurs intestinales",
//             traitement: "suppo et au lit !",
//           },
//         ],
//       },
//     }
//   );

//exo 3
//   db.products.find({ age: { $gt: 29 } });

//exo 4
//   db.products.deleteMany({ "historique.maladie": "rhume" });

db.products.find();
