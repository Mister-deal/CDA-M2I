import { useRef } from "react"
import { useNavigate } from "react-router-dom";



const Login = () => {
    const roleValue = useRef();
    const navigate = useNavigate();
    const passwordValue = useRef();
    // const setStorage = () => {
    //     localStorage.setItem("admin", JSON.stringify({role: roleValue, password: passwordValue}))
    //     navigate('/Add')
    // }

    const handleSubmit = (e) => {
        e.preventDefault()
        console.log(roleValue.current.value);
        if(roleValue.current.value === "Admin" && passwordValue.current.value === 1234 ){
            const newLogin = {
                role: roleValue,
                password: passwordValue
            };
            console.log(newLogin.role);
            console.log(newLogin.password);
        }else{
            alert('vous ne remplissez pas entièrement le formulaire')
        }
    }
    return(
        <form onSubmit={handleSubmit}>
            <div class="form-example">
                <label htmlFor="role">Enter your role: </label>
                <input type="text" name="role" ref={roleValue}  id="role" required />
            </div>
            <div class="form-example">
                <label htmlFor="">Enter your password: </label>
                <input type="password" name="password" ref={passwordValue}  id="password" required />
            </div>
            <div class="form-example">
                <button>Login</button>
            </div>
        </form>
    )
}
export default Login