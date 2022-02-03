import React, {useState} from 'react';

const Grade2 = () => {
    const [grade, setGrade] = useState({kor: 0, math: 0, eng: 0});


    const onChange = (e)=>{
        const {name,value} = e.target;
        //let name = e.target.name;
        //let value = e.target.value;
        
            // value의 값이 숫자가 아닐경우 빈문자열로 replace 해버림.
    const onlyNumber = value.replace(/[^0-9]/g, "");
    setGrade({ ...grade, [name]: numberCheck(onlyNumber) });

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
                type="text"
                name="kor"
                placeholder="국어"
                value={grade.kor}
                onChange={onChange}/>
            수학:
            <input
                type="text"
                name="math"
                placeholder="수학"
                value={grade.math}
                onChange={onChange}/>
            영어:
            <input
                type="text"
                name="eng"
                placeholder="영어"
                value={grade.eng}
                onChange={onChange}/>

            <div>
                총점은{Number(grade.kor) + Number(grade.math) + Number(grade.eng)}</div>
            <div>
                평균은{(Number(grade.kor) + Number(grade.math) + Number(grade.eng)) / 3.0}</div>
        </div>
    );
};

export default Grade2;