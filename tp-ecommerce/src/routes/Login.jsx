import { useRef } from "react"
import { useNavigate } from "react-router-dom";



const Login = () => {
    const roleValue = useRef();
    const navigate = useNavigate();
    const passwordValue = useRef();

    const handleSubmit = (e) => {
        e.preventDefault();
        const role = roleValue.current.value;
        const password = passwordValue.current.value;
        console.log(role);
        console.log(password);
        localStorage.setItem("role", role);
        localStorage.setItem("password", password);
        navigate("/Add");
    };
    
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