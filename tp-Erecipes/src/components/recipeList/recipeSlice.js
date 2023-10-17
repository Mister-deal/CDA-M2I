import { createSlice } from "@reduxjs/toolkit";


const recipeSlice = createSlice({
    name: "recipe",
    initialState: {
        recipes: []
    },
    reducers: {
        addRecipe: (state, action) => {
            const newRecipe = {
                id: Date.now(),
                title: action.payload.title,
                instructions: action.payload.instructions,
                cookTime: action.payload.cookTime,
                prepTime: action.payload.prepTime,
                ingredients: {
                    id: action.payload.id,
                    name: action.payload.name
                }
            }
            state.recipes.push(newRecipe)
        },
        deleteRecipe: (state, action) => {
            state.recipes.filter(recipe => recipe.id === action.payload.id)
        },
        updateRecipe: (state, action) => {
            const index = state.recipes.findIndex(recipe => recipe.id === action.payload.id)
            if(index != -1){
                state.recipes[index] = action.payload
            }
        }
    }
})

export const {addRecipe, deleteRecipe, updateRecipe} = recipeSlice.actions
export default recipeSlice.reducer