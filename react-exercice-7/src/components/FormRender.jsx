import React, {useState} from "react";

const FormRender = ({onAddContact}) => {
    const [mail, setMail] = useState('');
    const [password, setPassword] = useState('');


    const handleSubmit = (e) => {
        e.preventDefault()
        if (mail && password) {
            const newContact = {
                mail: mail,
                password: password
            };
            onAddContact(newContact)
            setMail('');
            setPassword('');
        }else{
            alert('veuillez remplir tous les champs');
        }
    }

    return(
        <form onSubmit={handleSubmit}>
            <input type="text" placeholder="mail" value={mail} onChange={(e) => setMail(e.target.value)} />
            <input type="password" placeholder="password" value={password} onChange={(e) => setPassword(e.target.value)}/>
            <button type="submit">Ajouter</button>
        </form>
    );

}
export default FormRender