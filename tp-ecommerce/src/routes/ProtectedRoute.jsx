import { Navigate } from 'react-router-dom'

const ProtectedRoute = (props) => {

    const testUser = false

    if(testUser){
        return (<>
            {props.children}
        </>)
    }else {
        return <Navigate to={"/Login"}></Navigate>
    }
}

export default ProtectedRoute