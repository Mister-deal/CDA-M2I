import React, { useState, useContext } from "react";
import { MyContext } from "../contexts/MyContext";

const CardsComponent = () => {
    const [value] = useContext(MyContext)
    if(value.length === 0){
        return <p>Aucun personne n'est présente</p>
    }
    return(
        <>
        {value.map((person, index) => (
            <div class="card" key={index}>
                <div class="card-header">
                    person's identity:
                </div>
                <ul class="list-group list-group-flush">
                    <li class="list-group-item">{person.name}</li>
                    <li class="list-group-item">{person.surname}</li>
                    <li class="list-group-item">{person.mail}</li>
                </ul>
            </div>

        ))}
        </>
    )
}
export default CardsComponent