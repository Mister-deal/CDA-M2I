import { useRef } from "react"
import { useDispatch, useSelector } from "react-redux"
import { SignInUser, SignUpUser, changeAuthMode } from "./authSlice"
import Form from 'react-bootstrap/Form';




const SignForm = () => {

    const authMode = useSelector(state => state.auth.authMode)
    const dispatch = useDispatch()
    const mailRef =  useRef()
    const passwordRef =  useRef()

    const submitFormHandler = async (e) => {
        e.preventDefault()

        const email = mailRef.current.value
        const password = passwordRef.current.value

        const credentials = {
            email,
            password,
            returnSecureToken: true
        }

        if(authMode === "Sign in"){
            dispatch(SignInUser(credentials))
            console.log(credentials);
        }else{
            dispatch(SignUpUser(credentials))
        }
    }

    return(
        <>
            <Form onSubmit={submitFormHandler}>
                <Form.Group className="mb-3" controlId="formBasicEmail">
                    <Form.Label>Email address</Form.Label>
                    <Form.Control type="email" placeholder="Enter email" ref={mailRef} />
                </Form.Group>

                <Form.Group className="mb-3" controlId="formBasicPassword">
                    <Form.Label>Password</Form.Label>
                    <Form.Control type="password" placeholder="Password" ref={passwordRef} />
                </Form.Group>
                <button className="btn btn-primary">{authMode}</button>
            </Form>
                <button className="btn btn-secondary" onClick={() => dispatch(changeAuthMode(authMode === "Sign in" ? "Sign up" : "Sign in"))}>
                    {authMode === "Sign in" ? "Sign up" : "Sign in"}
                </button>
        </>
    )
}

export default SignForm 