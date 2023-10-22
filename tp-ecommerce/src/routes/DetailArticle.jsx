import axios from "axios"
import { useEffect, useState } from "react"
import { useNavigate, useParams, Link } from "react-router-dom"



const DetailArticle = () => {
    const [article, setArticle] = useState([]);
    const param = useParams();
    const id = param.id;
    const addArticle = () => {
      const articleList = JSON.parse(localStorage.getItem("cart"));
      if (!articleList) {
        let newArticle = article;
        newArticle.quantity = 1;
        setArticle(newArticle);
        localStorage.setItem("cart", JSON.stringify([article]));
      } else if (articleList.find((a) => article.id === a.id)) {
        articleList.forEach((element) => {
          if (element.id === article.id) {
            ++element.quantity;
          }
        });
        localStorage.setItem("cart", JSON.stringify(articleList));
      } else {
        let newArticle = article;
        newArticle.quantity = 1;
        setArticle(newArticle);
        localStorage.setItem("cart", JSON.stringify([...articleList, article]));
      }
    };
    useEffect(() => {
      axios
        .get(`http://localhost:5000/articles/${id}`)
        .then((resp) => {
          setArticle(resp.data);
        })
        .catch((error) => {
          console.log(error);
        });
    });

    return(
        <>
        <h1>détail de l'article</h1>
        {article && 
        <>
        <h5>Nom:</h5>
        <p>{article.nom}</p>
        <h5>Description:</h5>
        <p>{article.description}</p>
        <h5>Prix:</h5>
        <p>{article.prix}</p>
        </>}
        
        <button onClick={() => addArticle}>Ajouter au panier</button>

        <Link to="/">Home</Link>
        </>
    )

}

export default DetailArticle