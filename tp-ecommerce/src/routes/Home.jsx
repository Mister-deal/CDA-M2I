import axios from "axios"
import { useEffect, useState } from "react"
import { NavLink, Outlet, Link  } from "react-router-dom"

const Home = () => {
    const[articles, setArticles] = useState([])
    

    const addArticle = (obj) => {
        const articleList = JSON.parse(localStorage.getItem("cart"));
        if (!articleList) {
          obj.quantity = 1;
          localStorage.setItem("cart", JSON.stringify([obj]));
        } else if (articleList.find((a) => obj.id === a.id)) {
          articleList.forEach((element) => {
            if (element.id === obj.id) {
              ++element.quantity;
            }
          });
          localStorage.setItem("cart", JSON.stringify(articleList));
        } else {
          obj.quantity = 1;
          localStorage.setItem("cart", JSON.stringify([...articleList, obj]));
        }
      };



    useEffect(() =>{
        axios.get(`http://localhost:5000/articles`)
        .then(response => {
            setArticles(prev => [...response.data])
        })
    },[])
    
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
            <ul>
                {articles.map((article) => (
                    <li key={article.id}>{article.nom}
                    <Link to={`detail/${article.id}`}> voir l'article</Link>
                    </li>
                ))}
            </ul>
            <Outlet />
            
        </div>
    )

}
export default Home