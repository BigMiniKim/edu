
import './App.css';



//JSX = JavaScript XML.
//React = JSX;
function App() {
  
  const x = 5; //5 > hello, 5<= goodbye
  
  return (
    <div className="App">
{ (x) < 10 ? "hello" : "goodbye" }
</div>
  
  );
}
export default App;
