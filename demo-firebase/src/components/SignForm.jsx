import { useRef } from "react"
import { setAuthMode } from "./auth/authSlice"
import { useDispatch, useSelector } from "react-redux"
import {SIGN_IN_URL, SIGN_UP_URL} from "../fireBaseConfig"

const SignForm = () => {
    const authMode = useSelector(state => state.auth.authMode)
    const dispatch = useDispatch()

    const emailRef = useRef()
    const passwordRef = useRef()
    
    const submitFormHandler = async (e) => {
        e.preventDefault()

        const email = emailRef.current.value
        const password = passwordRef.current.value

        const credentials ={
            email,
            password,
            returSecureToken: true
        }

        const URL = authMode === "Se connecter" ? SIGN_IN_URL : SIGN_UP_URL

        try{
            const response = await fetch(URL, {
                method:"POST",
                headers: {
                    "Content-type": "application/json"
                },
                body: JSON.stringify(credentials)
            })

            if(!response.ok){
                throw new Error("something went wrong during the " + authMode)
            }

            const data = await response.json()
            console.log(data);

            localStorage.setItem("token", data.idToken)

        } catch(error) {
            console.error(error.message);
        }
    }

    return(
        <>
            <h3>{authMode}</h3>
            <hr />
            <form onSubmit={submitFormHandler}>
                <div>
                    <label htmlFor="email">Email:</label>
                    <input type="text" id="email" ref={emailRef} />
                </div>
                <div>
                    <label htmlFor="password">Password:</label>
                    <input type="password" id="password" ref={passwordRef} />
                </div>
                <button>{authMode}</button>
            </form>
            <button onClick={() => dispatch(setAuthMode(authMode === "sign up" ? "sign in" : "sign up"))}>{authMode === "sign up" ? "sign in" : "sign up"}</button>
        </>
    )
}
export default SignForm
