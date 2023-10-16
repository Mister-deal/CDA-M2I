import { useDispatch } from "react-redux"
import { deleteProduct, updateProduct } from "./productsSlice"



const ProductItem = (props) => {
    const product = props.product
    const dispatch = useDispatch()

    return(
        <>
        <div>
            <span>Nom de l'article :{product.text} - Prix de l'article :{product.price}</span>
        </div>
        <button onClick={() => dispatch(updateProduct(product.id))}>Modifier</button>
        <button onClick={() => dispatch(deleteProduct(product.id))}>Supprimer</button>
        </>
    )
}


export default ProductItem