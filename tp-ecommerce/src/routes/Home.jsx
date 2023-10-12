import { NavLink, Outlet  } from "react-router-dom"

const Home = () => {
    
    return(
        <div>
            <header>
                <h1>Mon menu</h1>
                <NavLink to="/">home</NavLink>
                <br />
                <NavLink to="/Add">Ajouter Article</NavLink>
                <br />
                <NavLink to="/Cart">Panier</NavLink>
            </header>
            <Outlet />
            
        </div>
    )

}
export default Home