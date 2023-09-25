export class Person {
    constructor(firstname, lastname, dateOfBirth = new Date(), email, phoneNumber) {
        this._id = ++Person._count;
        this._firstname = firstname;
        this._lastname = lastname;
        this._dateOfBirth = dateOfBirth;
        this._email = email;
        this._phoneNumber = phoneNumber;
    }
    get id() {
        return this._id;
    }
    get firstname() {
        return this._firstname;
    }
    get lastname() {
        return this._lastname;
    }
    get dateOfBirth() {
        return this._dateOfBirth;
    }
    get email() {
        return this._email;
    }
    get phoneNumber() {
        return this._phoneNumber;
    }
    get fullname() {
        return this._firstname + " " + this._lastname;
    }
    set Id(value) {
        this._id = value;
    }
    set Firstname(value) {
        this._firstname = value;
    }
    set Lastname(value) {
        this._lastname = value;
    }
    set DateOfBirth(value) {
        this._dateOfBirth = value;
    }
    set Email(value) {
        this._email = value;
    }
    set PhoneNumber(value) {
        this._phoneNumber = value;
    }
}
Person._count = 0;
console.log("test");
