const result = document.querySelector(".result")

alert("ceci est un distributeur de boisson avec comme choix:Eau, Jus d'oranges, Limonade, Café et Thé")
const menu = Number(prompt(`****** Distributeur de boisson *******
        1)Eau
        2)jus d'oranges
        3)Limonade
        4)Café
        5)Thé
        
        Faites votre choix:`))
console.log(typeof(menu))
console.log(menu)

let boisson

switch(menu){
    case 1:
    boisson = "Eau"
    console.log("Vous avez choisi de l'eau");
    break;
    case 2:
    boisson = "jus d'oranges"
    console.log("Vous avez choisi du jus d'orange");
    break;
    case 3:
    boisson = "Limonade"
    console.log("Vous avez choisi de la limonade");
    break;
    case 4:
    boisson = "Café"
    console.log("Vous avez choisi du café");
    break;
    case 5:
    boisson = "Thé"
    console.log("Vous avez choisi du thé");
    break;
    default:
        console.log(`désolé, nous sommes soit en rupture de stock de ${boisson}, soit vous avez entré une valeur incorrecte.`);
}

affichage = `<p> Vous avez saisi la valeur ${menu}, donc ${boisson}</p>
            <p>nous vous remercions pour cet achat; n'oubliez pas votre boisson !</p>`

result.innerHTML = affichage