use("users");
// db.users.find();

//exo 1
// db.users.insertOne({age: 77, name: "Chuck Norris", hobbies: ["karate", "kung-fu", "ruling the world"]});
//exo 2 (1)
// db.users.find({name: "Chuck Norris"});

//exo 2(2)
// db.users.find({ name: "Chuck Norris"}, { _id: 0 });

//exo 2(3)
// db.users.find({ age: { $gte: 20, $lte: 25 } });

// db.users.find({ gender: "male", age: { $gte: 30, $lte: 40 } });

// db.users.find({ "address.state": "Louisiana" });

// db.users.find().sort({ age: -1 }).limit(20);

// db.users.count({ gender: "female", age: 30 });

// db.users.updateMany({}, {$unset: {phone: ""}});
// db.users.updateMany({name: "Chuck Norris"}, {$set: {age:"infinity"}})
db.users.find({name: "Chuck Norris"});


