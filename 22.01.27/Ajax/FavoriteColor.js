import React, {useState} from 'react';

const FavoriteColor = () => {

    /*let color = "빨간색";

    const changeColor = () =>{
        color = "노란색";
         console.log(color);
         alert(color);
    }
    return (
        <div>
            <h1>My favorite color is {color}</h1>
            <button onClick = {changeColor}> 색깔 바꿔보고 싶다</button>
        </div>
    );
    */

    const [color,setColor] = useState("Red");
    
    return (
        <div>
            <h1>My favorite color is {color}</h1>
            <button onClick = {() => setColor("blue")}> 색깔 바꿔보고 싶다</button>
        </div>
    );
    
};

export default FavoriteColor;