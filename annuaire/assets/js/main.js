import { Person } from "./classes/Person.js";
let person;
let person1;
person = new Person("Didier", "Duhamel", new Date("1994-07-17"), "didi.1957@gmail.com", "0674785124");
console.log(`lecture données; Surname: ${person.firstname}, Name: ${person.lastname}, DOB: ${person.dateOfBirth}, Email: ${person.email}, phoneNumber: ${person.PhoneNumber}`);
person1 = new Person("Didi", "Dechanel", new Date("1998-09-05"), "didi.1998loulou@gmail.com", "0774781204");
console.log(`lecture données; Surname: ${person1.firstname}, Name: ${person1.lastname}, DOB: ${person1.dateOfBirth}, Email: ${person1.email}, phoneNumber: ${person1.PhoneNumber}`);
