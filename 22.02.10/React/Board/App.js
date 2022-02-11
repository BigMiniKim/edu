import 'bootstrap/dist/css/bootstrap.min.css';
import Header from './components/Header';
import BoardTablesList from './pages/BoardTablesList';
import BoardPaging from './pages/BoardListWithPaging';
import { Router, Route, Routes } from 'react-router-dom';
import Board from './components/Board';
import BoardWrite from './components/BoardWrite';

function App() {
  return (
    <div>
      <Header></Header>
      {
        /* <Routes>
        <Route path="/" element={<BoardPaging />} />
        <Route path="/board/:bid" element={<Board />} />
        <Route path="/write" element={<BoardWrite />} />
      </Routes> */

        <Routes>
          <Route path="/" element={<BoardPaging />} />
          <Route path="/board/:bid" element={<Board />} />
          <Route path="/write" element={<BoardWrite />} />
        </Routes>
      }
    </div>
  );
}

export default App;
