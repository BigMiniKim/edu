
import './App.css';
import Car from "./Car.js"

//JSX = JavaScript XML.
//React = JSX;
function App() {
  
  const x = 5; //5 > hello, 5<= goodbye

  let text = "goodbyu"
  if( x < 10) {
    text = "hello text 5"
  }
  return (
    <div className="App">
{ text }
<Car></Car>
</div>
  
  );
}
export default App;
