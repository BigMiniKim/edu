import React from 'react';
import MadeGoal from './MadeGoal';
import MissedGoal from './MissedGoal';

const Header = (props) => {

/*const headerStyle = {
 color:"white",
 backgroundColor: "blue",
 padding: "10px",
 fontFamily:"sans-Serif"
};*/

const number = props.number;
if(number === 1)
return <MadeGoal></MadeGoal>
    else
    return <MissedGoal></MissedGoal>


   /* return (
        <div>
            <h1 style ={ {color:"red", background:"blue"} }> hello style</h1> 
        </div>
    );*/

   /* return (
        <div>
            <h1 style ={ headerStyle }> hello style</h1> 
        </div>
    )*/
};

export default Header;
