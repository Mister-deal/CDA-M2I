import { Client } from "./Client";
import { Product } from "./Product";
export class Order {
    constructor(id, client, produits){
        this.id = id;
        this.client = client; 
        this.produits = Product;
    }
}