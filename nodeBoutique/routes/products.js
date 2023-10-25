import express from 'express'

const products = express.Router();

products.get('/products', (req, res) =>{
    res.send("liste des produits")
})