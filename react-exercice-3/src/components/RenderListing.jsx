import React, {useState} from "react"
const RenderListing = () =>{
    const [elements, setElements] = useState([])
    const AddElement = () => {
        setElements([...elements, `Elements ${elements.length + 1}`]);
        console.log(AddElement);
        console.log(elements);
    }
    return(
        <div>
            <h2>liste d'éléments</h2>
            <ul>
                {elements.map((element, index) => (
                    <li key={index}>{element}</li>
                ))}
            </ul>
            <button onClick={AddElement}>click</button>
        </div>
    )
}

export default RenderListing