
import './App.css';
import FormRender from './components/FormRender';


function App() {

  const logInfo = (info) => {
    console.table(info);
  }
  
  return (
    <div className="App">
      <FormRender
      logInfo={logInfo}/>
    </div>
  );
}

export default App;
