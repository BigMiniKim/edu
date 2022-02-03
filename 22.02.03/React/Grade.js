
import React, {useState} from 'react';

const Grade = () => {
    const [kor,setKor] = useState(0);
    const [math,setMath] = useState(0);
    const [eng,setEng] = useState(0);

    const onChangeKor = (e) => {
        const {value} = e.target;
        //let value2 = e.target.value;
        const onlyNumber = value.replace(/[^0-9]/g, "");
        setKor(numberCheck(onlyNumber));
        
    }
    const onChangeMath = (e) => {
        const {value} = e.target;
        const onlyNumber = value.replace(/[^0-9]/g, "");
        setMath(numberCheck(onlyNumber));
        
    }
    const onChangeEng= (e) => {
        const {value} = e.target;

        //value 값이 숫자가 아닐경우 빈문자열로 replace 해버림.
        const onlyNumber = value.replace(/[^0-9]/g, "");

        setEng(numberCheck(onlyNumber));
        
    }

    const numberCheck = (v) => {
        
        let num = v || 0;
        if (!isFinite(num)) return;
        num = num.toString();
    
        if (num !== "0" && !num.includes(".")) {
          num = num.replace(/^0+/, "");
        }
        return num;
    };


    return (
        <div>
            국어:
            <input
            type = "text"
            name = "kor"
            placeholder="국어"
            value={kor}
            onChange = {onChangeKor}
            />
             수학:
            <input
            type = "text"
            name = "math"
            placeholder="수학"
            value={math}
            onChange = {onChangeMath}
            />
             영어:
            <input
            type = "text"
            name = "eng"
            placeholder="영어"
            value={eng}
            onChange = {onChangeEng}
            />
            
        
        <div> 총점은{ Number(kor) + Number(math) +Number(eng)  }</div>
        <div> 평균은{(Number(kor) + Number(math) +Number(eng) )/3.0}</div>
        </div>
    );
};

export default Grade;