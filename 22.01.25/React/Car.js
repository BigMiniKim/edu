import React from "react"

/*class Car extends React.Component{
    render () {
        return <h1>I have a car</h1>
    }
}*/


/*const Car = ()=> {
    return <h1> I am a cars</h1>;
}*/

/*const Car = (props)=> {
    return <h1> I am a {props.brand}cars</h1>;
}*/

//객체 구조 분할
const Car = ({brand})=> {
    return (<h1> I am a {brand} cars</h1>);
}



export default Car