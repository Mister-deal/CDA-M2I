let ajoutVal1 = (prompt("veuillez entrer une valeur"));
let ajoutVal2 = (prompt("veuillez entrer une autre valeur"));
console.log(typeof(ajoutVal1, ajoutVal2));

let x = parseInt(ajoutVal1);
let y = parseInt(ajoutVal2);

let resultat = x + y;

console.log(`le résultat final est: ${resultat}`);

const result = document.querySelector(".result");
result.innerHTML = `le résultat est: ${resultat}`;