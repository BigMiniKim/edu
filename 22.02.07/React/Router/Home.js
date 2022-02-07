import React from 'react';
import { Link } from 'react-router-dom';

const Home = () => {
  return (
    <div>
    <main>
      <h1>Home페이지 입니다</h1>
      <p>스파이더맨 홈 커밍</p>

    </main>
    <nav>
<Link to="/">Home</Link>

    </nav>
  </div>
  );
};

export default Home;