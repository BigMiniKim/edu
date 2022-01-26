import logo from './logo.svg';
import './App.css';

import Hello from "./Hello";
import {name} from "./person";
import {age} from "./person";
import msn from "./message"
import InputGrade from "./InputGrade"


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

     <InputGrade sub="국어:" > </InputGrade>
     <InputGrade sub="영어:"> </InputGrade>
     <InputGrade sub="수학:"> </InputGrade>
     <input type = "button" value = "총점"></input>
     <input type = "button" value = "평균"></input>



    </div>
    
  );
}

export default App;
