import { readFileSync, writeFileSync }from "fs"
import { v4 as uuidv4 } from "uuid";
import { resolve } from "path";


export default class ProductDao {
    constructor(){
        this.file = resolve("./data/dbProduct.json");
        this.products = [];
    }

    readFile() {
        const file = readFileSync(this.file, { encoding: "utf-8" });
        this.products = JSON.parse(file);
    }

    writeFile() {
        writeFileSync(this.file, JSON.stringify(this.products));
    }

    getAll() {
        return this.products;
    }

    save(product){
        product.id = uuidv4();
        this.products.push(product)
        this.writeFile();
        return product;
    }

    findById(id){
        return this.products.find((p) => p.id === id);
    }

    deleteClient(id){
        this.products = this.products.filter((p) => p.id !== id)
        this.writeFile();
    }

    updateClient(productUpdate) {
        const product = this.findById(productUpdate.id);
        if (product == undefined){
            return false;
        }
        product.titre = productUpdate.titre;
        product.prix = productUpdate.prix;
        product.stock = productUpdate.stock;

        this.writeFile();
        return true;
    }

    searchByTitle(titre){
        return this.products.filter(product => product.titre === titre)
    }
}