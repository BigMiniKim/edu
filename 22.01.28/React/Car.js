import React, {useState} from 'react';

const Car = () => {
    // let brand = "Ford"; const[brand, setBrand] = useState("Ford") const[model,
    // setModel] = useState("Benz")

    const [car, setCar] = useState({brand: "Ford2", model: "Bentz2", color: "red"})
    //1. 달라야 화면 갱신
    //2.객체일 경우 리액트에서 다르다고 판단하는 것은 객체의 첫번째 주소가 달라야
    const [year, setYear] = useState("2021");
    const updateColor = () => {

        //car.color = "blue"; 는 하면 안됨
        car.color = "blue";
        setCar(car => {
            return {
                ...car,
                color: "blue"
            } //car 복사, 스프레드 연산자(new) = java에서 new, 참조주소("")차이 생각해볼것

            /*setCar(previousState => {
            return {...previousState, color: "blue"}
        });*/

        })
    }

    return (
        <div>
            <h1>
                브랜드{car.brand}
                : {year}</h1>

            <p>
                It is a {car.model}
                색깔 {car.color}
            </p>
            <button type="button" onClick={updateColor}>
                색깔 바꾸려고?</button>
        </div>
    );
};

export default Car;
