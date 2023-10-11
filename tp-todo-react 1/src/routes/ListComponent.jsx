import React, { useState, useContext } from "react";
import { Mycontext } from "../contexts/Mycontext";

import axios from "axios";

const ListComponent = () => {
    const [value] = useContext(Mycontext)
    console.log(value);
    if(value.length === 0){
        return <p>Aucun tache n'est présente</p>
    }
    const deleteList = () => {
        const id = value;
        axios.delete(`http://localhost:5000/personnes/${id}`)
        .then(() => {
          console.log("personne avec id "+id+" supprimer")
        })
        .catch(error => {
          console.error("Erreur : ",error)
        })
    
      }

      const modifyList = () => {
        const id = value;
        axios.put(`http://localhost:5000/personnes/${id}`,{ title : "blabla", description : "brap"})
        .then(response => {
        console.log(response.data)
        })
        .catch(error => {
        console.error("Erreur : ",error)
        })
        console.log(value);
      }
    return(
        <>
        {value.map((task, index) => (
            <div class="card" key={index}>
                <div class="card-header">
                    task:
                </div>
                <ol class="list-group list-group-flush">
                    <li class="list-group-item">{task.title}</li>
                    <li class="list-group-item">{task.description}</li>
                </ol>
                <button className="btn btn-secondary" onClick={modifyList}>modifier</button>
                <button className="btn btn-secondary" onClick={deleteList}>suppression</button>
            </div>

        ))}
        </>
    )
}
export default ListComponent