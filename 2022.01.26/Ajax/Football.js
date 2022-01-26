const Football = () => {

   /* const shoot = () => {
    alert ("great shot");*/
/*const shoot = (msg) => {
    alert (msg);*/

    const shoes = (msg) => {
        
        alert (msg);
}


//html <button onclick = "shoot()" > Take the Shot!</button>
 //return (<button onClick={shoot}>Take the shot!</button>);
 //return (<button onClick={ ()=>shoot("goal")}>Take the shot!</button>);
//return (<button onClick={ ()=> {shoot("슛이에요")}}>슛버튼</button>);


return (<button onClick={ ()=> {shoes("나이키")}}>슛버튼</button>);

}



export default Football;