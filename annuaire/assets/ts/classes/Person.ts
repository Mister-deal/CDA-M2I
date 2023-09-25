 export class Person {
    private static _count: number = 0
    private _id: number;
    private _firstname: string;
    private _lastname: string;
    private _dateOfBirth: Date;
    private _email: string;
    private _phoneNumber: string;

    constructor(firstname: string, lastname: string, dateOfBirth: Date = new Date(), email: string, phoneNumber: string){
        this._id = ++Person._count
        this._firstname = firstname;
        this._lastname = lastname;
        this._dateOfBirth = dateOfBirth;
        this._email = email;
        this._phoneNumber = phoneNumber;
    }

    get id(){
        return this._id
    }

    get firstname(){
        return this._firstname
    }

    get lastname(){
        return this._lastname
    }

    get dateOfBirth(){
        return this._dateOfBirth
    }

    get email() {
        return this._email
    }

    get phoneNumber() {
        return this._phoneNumber
    }

    get fullname(){
        return this._firstname + " " + this._lastname
    }



    set Id(value:number) {
        this._id = value
    }
    set Firstname(value:string) {
        this._firstname = value
    }
    set Lastname(value:string) {
        this._lastname = value
    }
    set DateOfBirth(value:Date) {
        this._dateOfBirth = value
    }
    set Email(value:string) {
        this._email = value
    }
    set PhoneNumber(value:string) {
        this._phoneNumber = value
    }

    
}
console.log("test")