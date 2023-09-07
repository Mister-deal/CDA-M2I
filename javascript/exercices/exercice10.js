let email = "contact@teamjs.fr";
let mdp = "leLundiAuSoleil";

let emailAjout = prompt("veuillez entrer votre email");
let mdpAjout = prompt("veuillez entrer votre mot de passe");

if(emailAjout == email && mdpAjout == mdp){
    console.log("bienvenue à vous !");
}else{
    console.log("le mail ou le mot de passe ne correspond pas avec les données présentes dans la base de données. veuillez recharger la page.");
}
