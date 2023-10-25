import express from 'express'

const orders = express.Router();

orders.get('/orders', (req, res) =>{
    res.send("liste des commandes")
})