//importation de recipe.js et de recipeInterface.js
import { recipes } from "./recipes.js";
//creation d'une variable tableau d'objets liée au fichier Json recipes.ts
let recipe = [];
//récupération de l'objet recipes.ts dans le tableau recipe
for (let i in recipes) {
    console.log(i);
    recipe.push(recipes[i]);
}
console.table(recipe);
//interaction avec le DOM
const recipesContainer = document.getElementById('recipesContainer');
const prepSpan = document.getElementById('filter-prepTime-indicator');
const prepInput = document.getElementById('filter-prepTime');
const cookSpan = document.getElementById('filter-cookTime-indicator');
const cookInput = document.getElementById('filter-cookTime');
const nameInput = document.getElementById('filter-name');
const filterIngredients = document.getElementById('filter-ingredients');
//fonction pour rafraichir le tableau afin d'afficher le nom des recettes, leur temps de prep et de cuisson
const refreshRecipe = () => {
    //réinitialisation de la div
    recipesContainer.innerHTML = "";
    recipe.forEach(item => {
        const newDiv = document.createElement("div");
        newDiv.className = "mt-2 border  border-white p-3 rounded text-center";
        newDiv.innerHTML = `<h3>${item.name}</h3>
        <hr>
        <img src="./assets/img/chef-hat.svg" height= "30px" width= "auto"/>
        <span> ${item.prepTime} </span>
        <img src="./assets/img/fire.svg" height= "30px" width= "auto"/>
        <span> ${item.cookTime} </span>`;
        recipesContainer.appendChild(newDiv);
    });
};
refreshRecipe();
//récupération des ingrédients
const createFilterIngredient = () => {
    //création d'un tableau string pour récupérer ingredients dans recipes.ts
    let ingredientList = [];
    //récupération des valeurs au sein de recette, ainsi que des ingrédients
    recipe.forEach(item => {
        item.ingredients.forEach(ingredient => {
            console.log(!ingredientList.find(e => ingredient.name == e));
            if (!ingredientList.find(e => ingredient.name == e)) {
                const newIngredient = document.createElement("option");
                newIngredient.innerHTML = `${ingredient.name}`;
                //récupération de la value pour les filtres
                newIngredient.value = ingredient.name;
                filterIngredients.appendChild(newIngredient);
                ingredientList.push(ingredient.name);
            }
        });
    });
};
createFilterIngredient();
