import { useRef } from "react"
import { useDispatch } from "react-redux"
import { addRecipe } from "./recipeSlice"
import { BASE_DB_URL } from "../../fireBaseConfig"
import { removeUser } from "../auth/authSlice"



const RecipeForm = (props) => {
        const titleRef = useRef()
        const instructionsRef = useRef()
        const cookTimeRef = useRef()
        const prepTimeRef = useRef()
        const ingredientsRef = useRef([])
        const user = props.user
        const dispatch = useDispatch()




        const handleSubmit = async (event) => {
            event.preventDefault()
    
            const newRecipe = {
                id: Date.now(),
                title: titleRef.current.value,
                instructions: instructionsRef.current.value,
                cookTime: cookTimeRef.current.value,
                prepTime: prepTimeRef.current.value,
                ingredients: ingredientsRef.current.value
            }
    
            if(user.idToken) {
                try {
                    const response = await fetch(`${BASE_DB_URL}/todoList.json?auth=${user.idToken}`, {
                        method: "POST",
                        headers: {
                            "Content-Type" : "application/json"
                        },
                        body: JSON.stringify(newRecipe)
                    })
    
                    if(!response.ok){
                        throw new Error("Something went wrong during the POST request !")
                    }
    
                    const data = await response.json()
    
                    console.log(data);
                    dispatch(addRecipe(newRecipe))
                } catch(error) {
                    console.error(error.message);
                }
            }
        }
        return(
            <>
                <button onClick={() => dispatch(removeUser())}>Déconnexion</button>
                <form onSubmit={handleSubmit}>
                    <div>
                        <input type="text" placeholder="Ajouter le titre de la recette" ref={titleRef} />
                    </div>
                    <div>
                        <textarea name="instructions" id="instructions" cols="30" rows="10" ref={instructionsRef} placeholder="ajouter les instructions des plats ici"></textarea>
                    </div>
                    <div>
                        <input type="number" placeholder="Ajouter la durée de cuisson" ref={cookTimeRef} />
                    </div>
                    <div>
                        <input type="number" placeholder="Ajouter la durée de préparation" ref={prepTimeRef} />
                    </div>
                    <div>
                        <input type="text" placeholder="Ajouter le titre de la recette" ref={ingredientsRef} />
                    </div>
                </form>
            </>
        )
}
export default RecipeForm