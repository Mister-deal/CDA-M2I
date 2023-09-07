let ajoutPrenom = prompt("veuillez entrer votre prénom");
let ajoutNom = prompt("veuillez entrer votre nom");

let nomPrenom = ajoutNom + ajoutPrenom;
console.log("bonjour " + nomPrenom);

const result = document.querySelector(".result");
result.innerHTML = `salut ${nomPrenom}`;