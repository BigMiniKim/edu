import React,{useState ,useEffect} from 'react';



//화면을 다시 그리지 않는다. = 렌더링을 하지 않는다.
//화면을 리렌더링 한다 = 화면을 다시 그린다 = 해당 컴포넌트를 또 실행한다
const UseEffectExample = () => {
    
    const [name,setName] = useState("");
    const [count,setCount] = useState(0);
    const handleCountUp = () => {
        setCount(count + 1 );
        //count = count + 1;
    }
    const handleChangeName = (event) =>{
        console.log(event);
        setName(event.target.value);

    }
    //name 이 바뀔 때만 하고 싶은 일이 있다
    useEffect( () => {
        console.log("name 렌더링 ====이름이 바뀌고 있다");
        console.log({count,name});
    },[name]
    );


     //count 이 바뀔 때만 하고 싶은 일이 있다
     useEffect( () => {
        console.log("count 렌더링 ====숫자가 바뀌고 있다");
        console.log({count,name});
    },[count]
    );


    //랜더링 될때 마다 실행하고 싶다
    useEffect( () => {
        console.log("렌더링 될때마다");
        console.log({count,name});
    }
    );

        console.log("다시 실행되고 있음");

 //첫 렌더링 한번
    useEffect( () => {
        console.log("첫 렌더링 한번");
        console.log({count,name});
    },[]
    );

        console.log("다시 실행되고 있음");
    
    return (
        <div>
            <p>이름입력</p>
            <input type = "text" value= {name} onChange={handleChangeName}></input>
            <p>카운트{count}</p>
            <button onClick = {handleCountUp} >카운트업</button>
        </div>
    );
};

export default UseEffectExample;