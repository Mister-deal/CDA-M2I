import { Navigate } from 'react-router-dom'

const ProtectedRoute = (props) => {

    const authCheck = () => {
        const role = localStorage.getItem("role");
        const password = localStorage.getItem("password");
        if(role === "Admin" && password === "1234"){
            return true
        }else{
            return false
        }
    }

    if(authCheck()){
        return (<>
            {props.children}
        </>)
    }else {
        return <Navigate to={"/Login"}></Navigate>
    }
}

export default ProtectedRoute