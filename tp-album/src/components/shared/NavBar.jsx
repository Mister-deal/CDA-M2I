import { useDispatch, useSelector } from "react-redux";
import { changeAuthMode, removeUser } from "../auth/authSlice";
import Modal from "./Modal";
import SignForm from "../auth/SignForm";



const NavBar = () => {
    const user = useSelector(state => state.auth.user)
    const authMode = useSelector(state => state.auth.authMode)
    const dispatch = useDispatch()
    const formMode = useSelector(state => state.albums.formMode)

    return ( 
        <>
        {
            authMode && (
                <Modal onClose={() => dispatch(changeAuthMode(""))}>
                    <SignForm/>
                </Modal>
            )
        }
            <nav className="navbar navbar-expand-lg bg-body-tertiary rounded" data-bs-theme="dark">
                <div className="container-fluid">
                    <span className="navbar-brand"><i className="bi bi-globe"></i>Album</span>
                    <button 
                        onClick={() => !user ? dispatch(changeAuthMode("Sign in")) : dispatch(removeUser())}
                        className="ms-auto btn btn-info"
                    >
                        {user ? "Log out" : "Sign in"}
                    </button>
                </div>
            </nav>
        </>
     );
}
 
export default NavBar;