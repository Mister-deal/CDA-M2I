interface User {
    name: string;
    age: string | number;
    occupation: string;
}

interface Admin {
    name: string;
    age: string | number;
    role: string;
}

const user1: User = {
    name: "Toto Dupont",
    age: 35,
    occupation: "facteur"
};

const user2: Admin = {
    name: "Jeanne Doe",
    age: 25,
    role: "admin"
};

const user3: User = {
    name: "michel michel",
    age: 23,
    occupation: "lutteur"
};

const user4: User = {
    name: "michael flinch",
    age: 64,
    occupation: "gerant"
};

function info(person: User): string {
    return `voici les infos de la personne: ${person.name} ${person.age}`
}
function infoAdmin(Role: Admin): string {
    return `voici les infos de la personne: ${Role.name} ${Role.age}`
}

console.log(info(user1));
console.log(infoAdmin(user2));
console.log(info(user3));
console.log(info(user4));
console.table(info(user1));
console.table(infoAdmin(user2));
console.table(info(user3));
console.table(info(user4));