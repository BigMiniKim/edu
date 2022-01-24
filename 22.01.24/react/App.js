import logo from './logo.svg';
import './App.css';

import Hello from "./Hello";
import {name} from "./person";
import {age} from "./person";
import msn from "./message"


function App()  {
 let name = "홍길동";


  console.log(name);
  console.log(age)
  console.log(msn());
  return (
    //singleDOM만 지원함, 부모 한개만
    
    
    <div className="App">
      <Hello></Hello>
      <Hello></Hello>
     5 + 5 = { name + (5+5) } 입니다.
    </div>
    
  );
}

export default App;
