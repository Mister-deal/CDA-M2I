let nb1 = 10,
nb2 = 65,
resultat

//addition
resultat = nb1 + nb2
console.log(resultat);
console.log(`${nb1} + ${nb2} = ${resultat}`);

// la soustraction
resultat = nb1 - nb2
console.log(`${nb1} - ${nb2} = ${resultat}`);

//les multiplications
resultat = nb1 * nb2
console.log(`${nb1} * ${nb2} = ${resultat}`);

//division
resultat = nb1 / nb2
console.log(`${nb1} / ${nb2} = ${resultat}`);

//modulo
resultat = nb1 % nb2
console.log(`${nb1} % ${nb2} = ${resultat}`);

//incrémentation
nb1 = nb1 + 1 //incrémentation classique
console.log(nb1);
nb1 += 1 //opérateur combiné
console.log(nb1);
nb1++ //incrémentation
console.log(nb1);

//décrémentation
nb1 = nb1 - 1
console.log(nb1);
nb1 -= 1
console.log(nb1);
nb1--
console.log(nb1);


//incrémentation puis lecture de la valeur
console.log(++nb1)
//lecture de la valeur puis incrémentation
console.log(nb1++)

//décrémentation puis lecture de la valeur
console.log(--nb1)
//lecture de la valeur puis décrémentation
console.log(nb1--)
