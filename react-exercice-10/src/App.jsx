import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/js/bootstrap.min.js'
import FormComponent from './components/FormComponent';
import CardsComponent from './components/CardsComponent';
import { MyContext } from './contexts/MyContext';
import { useState } from 'react';

function App() {
  const myState = useState([])
  return (
    <div className="App">
      <h1>Name your friend/list</h1>
      <MyContext.Provider value={myState}>
        <br/>
      <FormComponent />
      <br/>
      <CardsComponent />
      <br/>
      </MyContext.Provider>
    </div>
  );
}

export default App;
