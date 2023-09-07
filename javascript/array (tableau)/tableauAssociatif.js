/*
    les tableaux associatifs (on accède aux éléments via la clé)
*/

//déclaration d'un tableau associatif
let personnes = {
    nom:"ringot",
    prenom:"christophe",
    age: 27
}
//affichage de la valeur associée à une clé
console.log(personnes.prenom);

//ajouter une clé et une valeur à notre tableau
personnes["clé"] = "valeur"
console.table(personnes);