import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/js/bootstrap.min.js'
import FormComponent from './routes/FormComponent';
import ListComponent from './routes/ListComponent';
import { Mycontext } from './contexts/Mycontext';
import { useState } from 'react';

function App() {
  const myState = useState([])
  return (
    <div className="App">
      <h2>List</h2>
      <Mycontext.Provider value={myState}>
        <FormComponent  />
        <ListComponent />
      </Mycontext.Provider>
    </div>
  );
}

export default App;
