/*
    les tableaux à 2 dimensions
*/

console.log("---------------------- les tableaux à 2 dimensions --------------------");

let legumes = ["carottes", "choux", "haricots"]
let fruits = ["pommes", "poire", "pèche"]

//création d'un tableau à 2 dimensions
let primeur = [legumes, fruits];

console.table(primeur);
console.log(primeur[1][0]);

//avec tableaux associatifs
let zoo = [
    {
        pseudo:"simba",
        espece:"lion",
        continent:"afrique"
    },
    {
        pseudo:"jack",
        espece:"kangourou",
        continent:"océanie"
    }
]
console.table(zoo);
console.log(`les pseudos sont: ${zoo[0].pseudo} et ${zoo[1].pseudo}`);