let poids = Number(prompt("Quelle est votre poids ?"))
let taille = Number(prompt("Quelle est votre taille ?"))
console.log(poids)
console.log(taille)

const result = document.querySelector(".result")

switch(true) {
    case(poids >= 48 && poids < 54 && taille >= 169 && taille < 183) ||
    (poids >= 54 && poids < 60 && taille >= 166 && taille < 178) ||
    (poids >= 60 && poids < 66 && taille >= 163 && taille < 175) ||
    (poids >= 66 && poids < 72 && taille >= 160 && taille < 172):
    result.innerText = "vous êtes dans notre catégorie de taille: Taille 2";
    break;
    case poids >= 43 && poids < 66 && taille >= 145 && taille < 172:
    result.innerText = "vous êtes dans notre catégorie de taille: Taille 1,5";
    break;
    case poids >= 54 && poids < 78 && taille >= 163 && taille < 187:
    result.innerText = "vous êtes dans notre catégorie de taille: Taille 1";
    break;
    default:
    result.innerText = "vous n'êtes dans aucune valeur présente dans notre catalogue de taille; vous avez dû mettre une donnée invalide. veuillez réessayer"
}
