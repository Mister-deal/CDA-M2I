import { useRef } from "react";
import { useDispatch } from "react-redux";
import { addProduct } from "./productsSlice";

const AddProduct = () => {
    const textRef = useRef();
    const priceRef = useRef();
    const dispatch = useDispatch();

    const handleSubmit = (event) => {
        event.preventDefault()
        console.log("sfsfsfsdfsdf");
        dispatch(addProduct({text: textRef.current.value, price: priceRef.current.value}))
    }

    return(
        <>
            <form onSubmit={handleSubmit}>
                <input type="text" placeholder="ajouter un produit" ref={textRef} />
                <input type="number" step={0.01} ref={priceRef} />
                <button type="submit">ajouter</button>
            </form>
        </>
    )
}

export default AddProduct