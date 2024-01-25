use("restaurant");
db.restaurants.aggregate([{ $limit: 10 }])
db.restaurants.aggregate([{ $limit: 10 }, { $sort: { "name": 1 } }])
db.restaurants.aggregate([
    { $match: { "borough": "Brooklyn" } },
    { $limit: 10 },
    { $sort: { "name": 1 } }
  ])
  db.restaurants.aggregate([
    { $project: { "name": 1, "borough": 1, "_id": 0 } },
    { $limit: 10 }
  ])
  db.restaurants.aggregate([
    { $project: { "name": 1, "borough": 1, "_id": 0 } },
    { $limit: 10 }
  ])
  db.restaurants.aggregate([
    { $project: { "address": 0, "grades": 0 } },
    { $limit: 10 }
  ])
  db.restaurants.aggregate([
    { $limit: 10 },
    { $project: { "name": 1, "borough": 1, "numGrades": { $size: "$grades" } } }
  ])
  db.restaurants.aggregate([
    { $limit: 10 },
    { $project: { "name": 1, "borough": 1, "numGrades": { $size: "$grades" } } },
    { $sort: { "numGrades": 1 } }
  ])
  db.restaurants.aggregate([
    { $limit: 10 },
    {
      $project: {
        "name": { $toUpper: "$name" },
        "borough": 1,
        "_id": 0
      }
    }
  ])
  db.restaurants.aggregate([
    { $limit: 10 },
    {
      $project: {
        "name": { $toUpper: "$name" },
        "borough": { $substr: ["$borough", 0, 3] },
        "_id": 0
      }
    }
  ])
  db.restaurants.aggregate([{ $group: { _id: null, count: { $sum: 1 } } }])
  db.restaurants.aggregate([{ $group: { _id: "$borough", count: { $sum: 1 } } }])
