const result = document.querySelector(".result");

let mot, motInverse, affichage

affichage = "<h1>Ce mot est un palindrome ?</h1>"

mot = prompt("veuillez saisir un mot:")
affichage += `<h3>vous avez saisi ${mot}</h3>`

motInverse = mot.split('').reverse().join('')
console.log(motInverse);

if(motInverse == mot){
    affichage += `<h3>Ce mot ${mot} est un palindrome</h3`
}else{
    affichage += `<h3>Ce mot ${mot} n'est pas un palindrome</h3`
}