use("book");
db.book.find();
// Trier les publications de « Toru Ishida » par titre de livre et par page de début.
// db.book.aggregate(
//     { $match: { authors: "Toru Ishida" } },
//     { $sort: { title: 1, "pages.start": 1 } }
//   );
  
  // Projeter le résultat sur le titre de la publication et les pages.
//   db.book.aggregate([
//     { $match: { authors: "Toru Ishida" } },
//     { $project: { _id: 0, title: 1, pages: 1 } }
//   ]);
  
//   Compter le nombre de ses publications.
//   db.book.aggregate([
//     { $match: { authors: "Toru Ishida" } },
//     { $group: { _id: null, count: { $sum: 1 } } }
//   ]);
  
  // Compter le nombre de publications depuis 2011 et par type.
//   db.book.aggregate([
//     { $match: { authors: "Toru Ishida", year: { $gte: 2011 } } },
//     { $group: { _id: "$type", count: { $sum: 1 } } }
//   ]);
  
  // Compter le nombre de publications par auteur et trier le résultat par ordre croissant.
  db.book.aggregate([
    { $unwind: "$authors" },
    { $match: { authors: "Toru Ishida" } },
    { $group: { _id: "$authors", count: { $sum: 1 } } },
    { $sort: { count: 1 } }
  ]);
  