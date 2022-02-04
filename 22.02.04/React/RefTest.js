import React, { useRef, useState } from 'react';

const RefTest = () => {

//useRef 첫번째 사용법: 변화는 감지해야 되지만, 렌더링은 하고 싶지 않을때

    const [count, setCount] = useState(0);
    const countRef = useRef(0);

    let countNormal = 0;






/*{
    current :0
}*/

    console.log("REF의 정체가 궁금하다")
    console.log(countRef);
    console.log(countRef.current);

    const increaseCountState = () => {
        setCount(count+1);
    }

    const increaseCountRef = () => {
        countRef.current = countRef.current + 1;
    }

    const increaseCountNormal = () => {
        countNormal = countNormal + 1;
    }

    return (
        <div>
        <p>State 값 : {count}</p>
        <p>Ref 값 : {countRef.current}</p>  
        <p>countNormal 값 : {countNormal}</p>             
        <button onClick={increaseCountState} >state 값 올려라</button>
        <button onClick={increaseCountRef}> Ref 값 올려라</button>
        <button onClick={increaseCountNormal}> 그냥 선언된 값 올려라</button>
        </div>

    );
};



export default RefTest;