export class Person {
    constructor(firstname, lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }
    render() {
        console.log(`prenom: ${this.firstname}, nom: ${this.lastname}`);
    }
}