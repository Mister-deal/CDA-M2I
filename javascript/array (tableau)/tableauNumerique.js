/*
    Les tableaux numériques (on accède aux éléments via l'index)
*/

//déclaration du tableau
let monTableau = [];
// letmonTableau = new Array() <----- équivalence

monTableau[0] = "pomme",
monTableau[1] = "poire",
monTableau[2] = "clementine";

monTableau[3, 4, 5] = "cerise", "prune", "myrtille";

console.log(monTableau);
console.table(monTableau);
console.log(monTableau[1]);

let legumes = ["carottes", "choux", "haricots"]
console.log(legumes[2]);
legumes[2] = "épinards"
console.log(legumes[2]);

let nbLegumes = legumes.length
console.log(`mon tableau contient ${nbLegumes} légumes`);

//insertion dans le dernier index
legumes[legumes.length] = "haricots"
console.table(legumes);

//legumes.push("haricots") -----> équivalence

//retirer le dernier élément d'un tableau
legumes.pop()

//retirer le premier élément d'un tableau
legumes.shift()

console.table(legumes);