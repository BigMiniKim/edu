import logo from './logo.svg';
import './App.css';
import { Link, Route, Routes } from 'react-router-dom';
import  About from "./About";
import  Home from "./Home";

function App() {
  return (
    <>
    <h1>환영합니다! 리액트 라우터</h1>
    <p>
      <Link style={{margin:"30px"} }to="/about">About</Link>
      <Link to="/">Home</Link>
      </p>

      <Routes>
    <Route path = "/" element = {<Home/>} > </Route>
    <Route path = "/about" element = {<About/>} > </Route>

      </Routes>
   
    </>
  );
}

export default App;
