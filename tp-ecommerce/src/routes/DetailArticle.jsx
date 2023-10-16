import axios from "axios"
import { useEffect, useState } from "react"
import { useNavigate, useParams, Link } from "react-router-dom"



const DetailArticle = () => {
    const { id } =  useParams();
    const [article, setArticle] = useState(null);
    const navigate = useNavigate();

    useEffect(() => {
        axios.get(`http://localhost:5000/articles/${id}`)
        .then(response => {
            setArticle(response.data)
        })
    },[id])

    // const AddPriceToCart = () => {
    //     axios.get()
    // }

    return(
        <>
        <h1>détail de l'article</h1>
        {article && 
        <>
        <p>{article.nom}</p>
        <p>{article.description}</p>
        </>}
        
        <button></button>

        <Link to="/">Home</Link>
        </>
    )

}

export default DetailArticle