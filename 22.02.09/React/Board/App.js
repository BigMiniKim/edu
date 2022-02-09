import "./App.css";
import Header from "./components/Header";
import "bootstrap/dist/css/bootstrap.min.css";
import BoardTablesList from "./pages/BoardTablesList";
import { Link, Route, Routes } from "react-router-dom";
import BoardWrite from "./components/BoardWrite";
import Board from './components/Board';
import BoardPaging from "./pages/BoardListWithPaging";

function App() {
  return (
    <div>
      <Header></Header>
      <Routes>
        <Route path="/" element={<BoardPaging/>} />
        <Route path="/write" element={<BoardWrite />} />
        <Route path="/board/:bid" element={<Board />} />
      </Routes>
    </div>
  );
}

export default App;