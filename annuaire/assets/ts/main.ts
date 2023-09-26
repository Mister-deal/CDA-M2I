import { Person } from "./classes/Person.js"


//instanciation d'un utilisateur test
let person: Person;
let person1: Person;
person = new Person("Didier", "Duhamel", new Date("1994-07-17"), "didi.1957@gmail.com", "0674785124")
console.log(`lecture données; Surname: ${person.firstname}, Name: ${person.lastname}, DOB: ${person.dateOfBirth}, Email: ${person.email}, phoneNumber: ${person.PhoneNumber}`)
let contacts: Person[] = [];
person1 = new Person("Didi", "Dechanel", new Date("1998-09-05"), "didi.1998loulou@gmail.com", "0774781204")
console.log(`lecture données; Surname: ${person1.firstname}, Name: ${person1.lastname}, DOB: ${person1.dateOfBirth}, Email: ${person1.email}, phoneNumber: ${person1.PhoneNumber}`)

//interaction avec le DOM
const modal = document.querySelector(".myModal") as HTMLElement;
const formModal = document.getElementById('#formAddContact');
//DOM FORM MODAL
const name = document.getElementById('add-firstname') as HTMLInputElement;
const surname = document.getElementById('add-lastname') as HTMLInputElement;
const birth = document.getElementById('add-dateOfBirth') as HTMLInputElement;
const mail = document.getElementById('add-email') as HTMLInputElement;
const phone = document.getElementById('add-phoneNumber') as HTMLInputElement;
const avatar = document.getElementById('add-avatarURL') as HTMLInputElement;
const btnSendModal = document.getElementById('btnSendModal');
//DOM affichage contact
const contactsContainer = document.getElementById('contactsContainer') as HTMLElement;

const btnAddContact = document.getElementById('btnAddContact');


function ShowContacts() {
    contactsContainer.innerHTML += `
    <ul>
        <li> ${name.value}` + ' ' + `${surname.value}</li>
    </ul>`
}

btnSendModal.onclick = (e) => {
    e.preventDefault()
    console.log("test");
    //récupération des données de saisie du modal
    name.value;
    console.log(name.value);

    surname.value;
    console.log(surname.value);

    birth.value;
    console.log(birth.value);

    mail.value;
    console.log(mail.value);

    phone.value;
    console.log(phone.value);

    avatar.value;
    console.log(avatar.value);
    
    ShowContacts();
}

function OpenModal(){
    modal.style.display = 'block';
}

function closeModal(){
    modal.style.display = 'none';
}

function closeModalBtnSend(){
    modal.style.display = 'none'
}


btnAddContact.addEventListener('click', OpenModal);
btnSendModal.addEventListener('click', closeModalBtnSend);

window.addEventListener('click', (event) => {
    if(event.target === modal){
        closeModal();
    }
})