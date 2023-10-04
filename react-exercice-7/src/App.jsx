import React, { useState } from 'react';
import RenderTable from './components/RenderTable';
import FormRender from './components/FormRender';
import './App.css';

function App() {
  const[contacts, setContacts] = useState([]);
  const addContact = (newContact) => {
    setContacts([...contacts, newContact])
}
  return (
    <div className="App">
      <h1>répertoire en ligne</h1>
      <FormRender onAddContact={addContact}/>
      <h3>contacts</h3>
      <RenderTable contacts={contacts}/>
    </div>
  );
}

export default App;
