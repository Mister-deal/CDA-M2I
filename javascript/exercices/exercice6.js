let longueurCarre = Number(prompt("entrez la longueur du carré"));

let perimetreCarre = longueurCarre * 4;
console.log(perimetreCarre);

let aireCarre =  longueurCarre * longueurCarre;
console.log(aireCarre);

let longueurRectangle = Number(prompt("entrez la longueur du rectangle"));
let largeur = Number(prompt("entrez la largueur du rectangle"));


let perimetreRectangle = longueurRectangle * 2 + largeur * 2;
console.log(perimetreRectangle);

let aireRectangle = longueurRectangle * largeur;
console.log(aireRectangle);

const perimeterCar = document.querySelector(".perimeterCar");
perimeterCar.innerHTML = `le périmètre du carré est de:${perimetreCarre}`

const perimeterRec = document.querySelector(".perimeterRec");
perimeterRec.innerHTML = `le périmètre du rectangle est de:${perimetreRectangle}`

const aireCar = document.querySelector(".aireCar");
aireCar.innerHTML = `l'aire du carré est de:${aireCarre}`

const aireRec = document.querySelector(".aireRec");
aireRec.innerHTML = `l'aire du rectangle est de:${aireRectangle}`
