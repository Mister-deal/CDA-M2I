//interaction dans le DOM
const resultName = document.querySelector('.resultName');


//mettre URL API dans constante
const apiUrl = "https://pokeapi.co/api/v2/pokemon/1"
let num = 1;
let id = "https://pokeapi.co/api/v2/pokemon/"+ num;


//utilisation du fetch
/*
fetch(apiUrl)
    .then(response => {
        if(!response.ok){
            throw new Error(`request didn't manage to retrieve anything, with a status number report of ${response.status}`)
        }
        return response.json()
    }).then(data => {
        console.log("received data :", data);
    }).catch(error => {
        console.error("Error : ")+ error;
    })


fetch(apiUrl)
    .then(response => response.json())
    .then(data => {
        const imageUrl = data.sprites.front_default;
        const imageElement = document.createElement("img");
        imageElement.src = imageUrl;
        document.body.appendChild(imageElement);
        const pokemonName = data.name;
        console.log(`the pokemon name is: ${pokemonName}`);
        resultName.innerHTML = `${pokemonName}`

        const pokemonHeight = data.weight;
        console.log(`the pokemon height is: ${pokemonHeight} cm`);
        resultHeight.innerHTML = `${pokemonHeight} cm`

        const pokemonWeight = data.height;
        console.log(`the pokemon weight is: ${pokemonWeight} kg`);
        resultWeight.innerHTML = `${pokemonWeight} kg`
    })

*/

//fonction pour récupérer l'id d'un seul pokemon
function FetchPokemonData(pokemonId) {
    const apiUrlId = `https://pokeapi.co/api/v2/pokemon/${pokemonId}/`;

    return fetch(apiUrlId)
    .then(response => {
        if(!response.ok){
            throw new Error(`HTTP Error! Status? Buck Broken! ${response.status}`);
        }
        return response.json();
    });
}
//fonction pour récupérer les nombreux Ids de pokemon
function FetchMultiplePokemons(pokemonIds) {
    const promises = pokemonIds.map(pokemonId => FetchPokemonData(pokemonId));

    return Promise.all(promises);
}

const pokemonIdsToFetch = [1, 2 , 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
FetchMultiplePokemons(pokemonIdsToFetch)
    .then(pokemonDataArray => {
        pokemonDataArray.forEach(pokemonData => {
            const imageUrl = pokemonData.sprites.front_default;
            const imageElement = document.createElement("img");
            imageElement.src = imageUrl;
            resultName.appendChild(imageElement)

            const pokemonName = pokemonData.name;
            const pokemonNameElm = document.createElement('p');
            pokemonNameElm.textContent = `Nom: ${pokemonName}`;
            resultName.appendChild(pokemonNameElm);

            const pokemonHeight = (pokemonData.height)/10;
            const pokemonHeightElm = document.createElement('p');
            pokemonHeightElm.textContent = `Taille: ${pokemonHeight} Mètre(s)`;
            resultName.appendChild(pokemonHeightElm);

            const pokemonWeight = pokemonData.weight;
            const pokemonWeightElm = document.createElement('p');
            pokemonWeightElm.textContent = `Poids: ${pokemonWeight} Kg`;
            resultName.appendChild(pokemonWeightElm);

            console.log(`Pokemon Id: ${pokemonData.id}`);
            console.log(`Pokemon Name: ${pokemonData.name}`);
            console.log(`Pokemon Height: ${pokemonData.height}`);
            console.log(`Pokemon Weight: ${pokemonData.weight}`);
            console.log(`Pokemon Image: ${pokemonData.sprites.front_default}`);
        });
    }).catch(error => {
        console.error("Error fetching pokemon data", error);
    });



