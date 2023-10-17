import { useRef } from "react"
import { removeUser } from "../auth/authSlice"


const TaskForm = () => {
    const textRef = useRef()

    const handleSubmit = async (e) => {
        e.preventDefault()

    }

    return(
        <>
        <button onClick={() => dispatchEvent(removeUser())}>Déconnexion</button>
        <form action="" onSubmit={handleSubmit}>
            <input type="text" placeholder="Ajouter une tâche" ref={textRef} />
        </form>
        </>
    )
}
export default TaskForm;