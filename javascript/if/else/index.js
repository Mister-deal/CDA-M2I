/*
    structures conditionnelles
*/

let compte = 300

if(compte > 0) {
    console.log("votre compte est créditeur");
}
if(compte < 0) {
    console.log("votre compte est débiteur");
}

if(compte > 0){
    console.log("votre compte est créditeur");
}else{
    console.log("votre compte est débiteur");
}

if(compte > 0){
    console.log("votre compte est créditeur");
}else if (compte == 0) {
    console.log("votre compte est à 0");
}else{
    console.log("votre compte est débiteur");
}

let estVrai = false;

if(estVrai){
    console.log("c'est vrai");
}else{
    console.log("c'est faux");
}

console.log(1 == 1); //est vrai
console.log("1" == 1)//est vrai
console.log(1 === 1)//est vrai
console.log("1" === 1)//est faux
