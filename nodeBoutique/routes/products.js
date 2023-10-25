import express from 'express'
import { Product } from '../classes/Product';
import ProductDao from '../dao/ProductDao';

const products = express.Router();
products.use(express.json())
const productDao = new ProductDao();
productDao.readFile();

products.get('/products', (req, res) =>{
    res.send(productDao.getAll())
})