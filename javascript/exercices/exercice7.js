
const result =  document.querySelector(".result")

let cote1,
    cote2,
    sommeCarre,
    hypotenuse

cote1 = Number(prompt("saisir la longueur du 1er côté :"))
cote2 = Number(prompt("saisir la longueur du 2ème côté :"))

sommeCarre =  Math.pow(cote1, 2) + Math.pow(cote2, 2)
hypotenuse = Math.sqrt(sommeCarre).toFixed(2)

affichage = `<p> Les longueurs des côtés du carré : ${cote1} cm et ${cote2} cm</p>
            <p>La longueur de l'hypoténuse : ${hypotenuse} cm</p>`

result.innerHTML = affichage