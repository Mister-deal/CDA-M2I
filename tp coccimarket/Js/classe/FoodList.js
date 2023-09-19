import Food from "./Food.js";

export class FoodList {
    constructor(){
        this.foodies = [];
        this.cpt = 0;
    }

    addFood(text) {
        const food = new Food(this.cpt++, text);
        this.foodies.push(food);
    }

    removeFood(id) {
        this.foodies = this.foodies.filter(food => food.id != id);
    }

    renderFoods() {
        const ingredientList = document.getElementById('ingredientList');
        ingredientList.innerHTML = '';

        this.foodies.forEach(food => {
            const foodItem = food.render();
            ingredientList.appendChild(foodItem);
        });
    }
}