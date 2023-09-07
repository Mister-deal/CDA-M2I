let diametre = Number(prompt("entrez la valeur du diamètre"));


let perimetre = Math.PI * diametre;
console.log(perimetre);

const r = diametre / 2;
console.log(r);

let aire = Math.PI * r * r;
console.log(aire)


console.log(Math.round(perimetre));
console.log(Math.round(aire));

const perimeter = document.querySelector(".perimeter");
perimeter.innerHTML = `le résultat du périmètre est de: ${perimetre}`

const area = document.querySelector(".area");
area.innerHTML = `le résultat du périmètre est de: ${aire}cm²`

let perimetreEntier = Math.round(perimetre);
let aireEntier = Math.round(aire);

const perimeterInt = document.querySelector(".perimeterInt");
perimeterInt.innerHTML = `le résultat du périmètre est de: ${perimetreEntier}`

const areaInt = document.querySelector(".areaInt");
areaInt.innerHTML = `le résultat du périmètre est de: ${aireEntier}cm²`
