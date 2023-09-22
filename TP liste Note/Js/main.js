import { Note } from "./classes/Note.js";
let tableTask = new Note();

//interaction avec le dom
const inputName = document.getElementById('inputName');
const inputSurname = document.getElementById('inputSurname');
const inputSubject = document.getElementById('inputSubject');
const inputNote = document.getElementById('inputNote');
const addValues = document.getElementById('addValues');
const form = document.querySelector('.listForm');
const tableList = document.querySelector('#tableList')

const student = {
    name : "Morvan",
    surname: "Maxime",
    subject: "Math",
    note: 12
}

//event listener
form.addEventListener("submit", addNote)
addValues.addEventListener("click", addNote)

//essai injection données provenant constante student
const element = document.createElement("tr");
    element.innerHtml = `<td>${student.name}</td>
                        <td>${student.surname}</td>
                        <td>${student.subject}</td>
                        <td>${student.note}</td>
`
console.table(element);
//fonctions

//add Notes
function addNote(e) {
    e.preventDefault();
    const valueName = inputName.value;
    const valueSurname = inputSurname.value;
    const valueSubject = inputSubject.value;
    const valueNote = inputNote.value;

    const element = document.createElement("tr");
    element.innerHtml = `<td>${valueName}</td>
                        <td>${valueSurname}</td>
                        <td>${valueSubject}</td>
                        <td>${valueNote}</td>
`;
console.table(element);
console.log(valueName);
console.log(valueSurname);
console.log(valueSubject);
console.log(valueNote);
}
