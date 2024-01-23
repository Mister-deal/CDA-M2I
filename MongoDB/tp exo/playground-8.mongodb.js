use("tp_aggregation");
// db.sportifs.find();
// db.sportifs.aggregate([
//     {$match: {
//       Age: {
//         $gte: 20,
//         $lte: 30
//       }
//     }
//     },
//     {
//         $project: {
//       Nom: 1,
//       Prenom: 1,
//       Age: 1
//         }
//     }
// ]
// )

// db.gymnases.find();

// db.gymnases.aggregate([
//     {
//         $match: {
//           Surface:{
//               $gte: 400
//           }
//         }
//     },
//     {
//         $match: {
//             $or: [
//                 {
//                     Ville: "VILLETANEUSE"
//                 },
//                 {
//                     Ville: "SARCELLES"
//                 }
//             ]
//         }
//     }
   
// ]
// )

// db.sportifs.find({
//     "Sports.Jouer": "Hand ball"
// }, {
//     _id: 0,
//     IdSportif: 1,
//     Nom: 1
// })

// db.sportifs.aggregate([{
//     $match: {
//       "Sports.Jouer": null
//     }
// },
// {
//     $project: {
//       nom:1,
//       prenom: 1
//     }
// }
// ])



// db.gymnases.aggregate([
//     {
//         $match: {
//             $or: [
//                 {"Seances.Libelle": "Basket ball"},
//                 {"Seances.Libelle": "Volley ball"}
//             ]
//         }
//     },
//     {
//         $project: { _id: 0, NomGymnase: 1,"Seances.Libelle":1 }
//     }
// ])

