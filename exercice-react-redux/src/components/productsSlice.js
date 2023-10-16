import { createSlice } from '@reduxjs/toolkit'


const productsSlice = createSlice({
    name: "product",
    initialState: {
        products: [

        ],
        counterProduct: 1
    },
    reducers: {
        addProduct: (state, action) => {
            const newProduct = {
                id: Date.now(),
                text: action.payload.text,
                price: action.payload.price
            }
            state.products.push(newProduct)
            state.counterProduct += 1
        },
        deleteProduct: (state, action) => {
            state.products = state.products.filter(product => product.id !== action.payload)
        },
        updateProduct: (state, action) => {
            const index = state.products.findIndex(product => product.id === action.payload.id)
            if(index !== -1){
                state.products[index] = action.payload
            }
            console.log(updateProduct);
        },
    },
});


export const {addProduct, deleteProduct, updateProduct} = productsSlice.actions
export default productsSlice.reducer