const Football = () => {

   /* const shoot = () => {
    alert ("great shot");*/
/*const shoot = (msg) => {
    alert (msg);*/

    const shoot = (msg,event) => {
        console.log(event);
        alert (msg);
}


//html <button onclick = "shoot()" > Take the Shot!</button>
 //return (<button onClick={shoot}>Take the shot!</button>);
 //return (<button onClick={ ()=>shoot("goal")}>Take the shot!</button>);
//return (<button onClick={ ()=> {shoot("슛이에요")}}>슛버튼</button>);


return (<button onClick={ (event)=> {shoot("슛이에요",event)}}>슛버튼</button>);
}



export default Football;