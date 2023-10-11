import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap-icons/font/bootstrap-icons.css'
import AlertButton from './components/AlertButton';
import AnyAlert from './components/AnyAlert';
import AlertValue from './components/AlertValue';

function App() {
  return (
    <div className="App">
      <AlertButton />
      <AnyAlert bgColor="blue" />
      <AnyAlert bgColor="green" icon="bi bi-checked" label="tout va bien"/>
      <AlertValue />
      <AlertValue bgColor="primary" icon="check" label="c'est cool"/>
      <AlertValue bgColor="secondary" icon="card-checklist" label="opérationnel"/>
    </div>
  );
}

export default App;
