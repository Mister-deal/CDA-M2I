"use strict";
const user1 = {
    name: "Toto Dupont",
    age: 35,
    occupation: "facteur"
};
const user2 = {
    name: "Jeanne Doe",
    age: 25,
    role: "admin"
};
const user3 = {
    name: "michel michel",
    age: 23,
    occupation: "lutteur"
};
const user4 = {
    name: "michael flinch",
    age: 64,
    occupation: "gerant"
};
function info(person) {
    return `voici les infos de la personne: ${person.name} ${person.age}`;
}
function infoAdmin(Role) {
    return `voici les infos de la personne: ${Role.name} ${Role.age}`;
}
console.log(info(user1));
console.log(infoAdmin(user2));
console.log(info(user3));
console.log(info(user4));
console.table(info(user1));
console.table(infoAdmin(user2));
console.table(info(user3));
console.table(info(user4));
