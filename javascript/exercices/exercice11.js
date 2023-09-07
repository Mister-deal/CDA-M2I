let lettre = prompt("entrez une lettre");

const voyelle = ["a", "e", "i", "o", "u", "A", "E", "I", "O", "U"];

for(let i = 0; i < voyelle.length; i++){
    if(lettre === voyelle[i]){
        console.log("la lettre est une voyelle")
        break
    }else{
        console.log("c'est une consonne ou autre chose")
        break
    }
}

document.querySelector(".vowels").innerHTML += str;