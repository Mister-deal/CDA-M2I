import React, {useState} from "react";
const FizzBuzzRender = (props) => {
    const [elements, setElements] = useState(0)
    let message = ""

    if(elements % 3 === 0 && elements % 5 === 0){
        message = `Fizzbuzz`
    }else if(elements % 3 === 0){
        message = `Fizz`
    }else if(elements % 5 === 0){
        message = `Buzz`
    }else{
        message = elements;
    }
    const AddElement = () => {
        if (elements < props.max) {
            setElements(elements + 1);
            
        }
        console.log(AddElement);
        console.log(elements);
    }
    const DecreaseElement = () => {
        if (elements > 0) {
            setElements(elements - 1);
            
        }
        console.log(DecreaseElement);
        console.log(elements);
    }
    const RestartElement = () => {
        setElements(0);
    }


    return(
        <>
            <h2>FizzBuzz</h2>
                <p >element n° {elements}: {message}</p>
                <button onClick={AddElement}>Add</button>
                <br/>
                <button onClick={DecreaseElement}>Decrease</button>
                <br/>
                <button onClick={RestartElement}>Reset</button>
        </>
    )
}
export default FizzBuzzRender