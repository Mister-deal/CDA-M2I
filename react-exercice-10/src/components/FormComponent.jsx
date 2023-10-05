import React, {useState} from "react";
import { useContext } from "react";
import { MyContext } from "../contexts/MyContext";

const FormComponent = () => {
    const[name, SetName] = useState('');
    const[surname, SetSurname] = useState('');
    const[mail, SetMail] = useState('');
    const [_, setValue] = useContext(MyContext)
    

    const handleSubmit = (e) => {
        e.preventDefault()
        if(name && surname && mail){
            const newContact = {
                name: name,
                surname: surname,
                mail: mail
            };
            setValue(prevState => [...prevState, newContact])
            SetName('');
            SetSurname('');
            SetMail('');
        }else{
            alert('vous êtes prié de remplir tous les champs pour inscrire cette personne')
        }
    }

    return(
        <>
        <form onSubmit={handleSubmit}>
            <div class="form-group">
                <label htmlFor="my-mail">Email address:</label>
                <input type="email" class="form-control" value={mail} onChange={(e) => SetMail(e.target.value)} aria-describedby="emailHelp" placeholder="Enter email"/>
                <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else, be assured.</small>
            </div>
            <div class="form-group">
                <label htmlFor="my-surname">Surname:</label>
                <input type="text" class="form-control" value={surname} onChange={(e) => SetSurname(e.target.value)} placeholder="Surname"/>
            </div>
            <div class="form-group">
                <label htmlFor="my-surname">Name:</label>
                <input type="text" class="form-control" value={name} onChange={(e) => SetName(e.target.value)} placeholder="Name"/>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
        
        </>
    )
}
export default FormComponent