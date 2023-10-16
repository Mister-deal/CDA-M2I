import { useRef } from "react";
import { NavLink, useNavigate } from "react-router-dom";
import axios from 'axios'



const AddArticle = () => {
  const nomArticle = useRef();
  const descriptionArticle = useRef();
  const prixArticle = useRef();
  const navigate = useNavigate();

  const AddArticleDb = () => {
    axios.post("http://localhost:5000/articles", { nom: nomArticle.current.value, description: descriptionArticle.current.value, prix: prixArticle.current.value })
    .then(response => {
      console.log(response.data);
      navigate('/')
    })
    .catch(error => {
      console.error("Erreur :", error)
    })
  }

    return (
        <div >
          <header >
            <h1>Mon Formulaire</h1>
            <NavLink to="/">Home</NavLink>
          </header>
          <h3>ajout article</h3>
          <div class="form-example">
                <label htmlFor="article">enter the article's name here: </label>
                <input type="text" name="article" ref={nomArticle}  id="article" required />
            </div>
            <div class="form-example">
                <label htmlFor="description">please enter a description of the article here: </label>
                <textarea name="description" id="description" ref={descriptionArticle} cols="20" rows="5"></textarea>
            </div>
            <div class="form-example">
                <label htmlFor="prix">enter the article's price here: </label>
                <input type="number" name="prix" ref={prixArticle}  id="prix" required />
            </div>
            <div class="form-example">
                <button onClick={AddArticleDb}>Add an Article</button>
            </div>
        </div>
      );
}
export default AddArticle