import React, {useEffect, useState} from "react";
import { useContext } from "react";
import { Mycontext } from "../contexts/Mycontext";
import axios from 'axios';
import { useNavigate } from "react-router-dom";

const FormComponent = () => {
    const[title, SetTitle] = useState('');
    const[description, SetDescription] = useState('');
    const [_, setValue] = useContext(Mycontext)
    const navigate = useNavigate();

    useEffect(() => {
        axios.get("http://localhost:5000/liste")
        .then(response => {
            console.log(response.data);
        })
        .catch(error => {
            console.log("erreur : ", error);
        })
    }, [])

    const AddList = () => {
        axios.post("http://localhost:5000/liste",{title: title, description: description})
        .then(response => {
            console.log(response.data);
            navigate('/list')
        })
        .catch(error => {
            console.log("erreur :", error);
        })
    }

    const handleSubmit = (e) => {
        e.preventDefault()
        if(title && description){
             const newList = {
                 title: title,
                 description: description
             };
             setValue(prevState => [...prevState, newList])
             SetTitle('');
             SetDescription('');
         }else{
             alert('vous êtes prié de remplir tous les champs pour initialiser cette liste de taches')
         }
    }

    return(
        <>
       <form onSubmit={handleSubmit}> 
    
            <div class="form-group">
                <label htmlFor="my-mail">Title Task:</label>
                <input type="text" class="form-control" value={title} onChange={(e) => SetTitle(e.target.value)} aria-describedby="titleHelp" placeholder="Enter Title in order to create a listing"/>
            </div>
            <div class="form-group">
                <label htmlFor="my-surname">Description:</label>
                <textarea type="text" class="form-control" value={description} onChange={(e) => SetDescription(e.target.value)} placeholder="Enter description of the task you'll be doing"/>
            </div>
            <button onClick={AddList} type="submit" class="btn btn-primary">Submit</button>
        </form>
        
        </>
    )
}
export default FormComponent