import React from 'react';
import Goal from './Goal';
import './App.css';
import Header from './Header';
import FavoriteColor from './FavoriteColor';

function App() {
  return (
    <div className="App">
      <Header number={1}></Header>
      <Goal isGoal={false}/>
      <FavoriteColor/>
    </div>
  );
}

export default App;
