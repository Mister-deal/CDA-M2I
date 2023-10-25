import { readFileSync, writeFileSync }from "fs"
import { v4 as uuidv4 } from "uuid";
import { resolve } from "path";


export default class ClientDao {
    constructor(){
        this.file = resolve("./data/dbClient.json");
        this.clients = [];
    }

    readFile() {
        const file = readFileSync(this.file, { encoding: "utf-8" });
        this.clients = JSON.parse(file);
    }

    writeFile() {
        writeFileSync(this.file, JSON.stringify(this.clients));
    }

    getAll() {
        return this.clients;
    }

    save(client){
        client.id = uuidv4();
        this.clients.push(client)
        this.writeFile();
        return client;
    }

    findById(id){
        return this.clients.find((c) => c.id === id);
    }

    deleteClient(id){
        this.clients = this.clients.filter((c) => c.id !== id)
        this.writeFile();
    }

    updateClient(clientUpdate) {
        const client = this.findById(clientUpdate.id);
        if (client == undefined){
            return false;
        }
        client.nom = clientUpdate.nom;
        client.prenom = clientUpdate.prenom;
        client.telephone = clientUpdate.telephone;

        this.writeFile();
        return true;
    }
    searchByClientName(name){
        return this.clients.filter(client => client.nom === name)
    }
}
