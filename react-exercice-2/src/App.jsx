import logo from './logo.svg';
import './App.css';
import TableComponent from './components/TableComponent';
import 'bootstrap/dist/css/bootstrap.min.css'

function App() {
  return (
    <div className="App">
      <table class="table">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">First</th>
            <th scope="col">Last</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <th scope="row">1</th>
            <TableComponent/>
          </tr>
          <tr>
            <th scope="row">2</th>
            
          </tr>
          <tr>
            <th scope="row">3</th>
            
          </tr>
          <tr>
            <th scope="row">4</th>
            
          </tr>
          <tr>
            <th scope="row">5</th>
            
          </tr>
          <tr>
            <th scope="row">6</th>
            
          </tr>
        </tbody>
      </table>
    </div>
  );
}

export default App;
