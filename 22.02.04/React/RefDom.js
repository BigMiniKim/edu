import React, { useEffect, useRef, useState } from 'react';

const RefDom = () => {
  const [inputs, setInputs] = useState({
    name: '',
    nickname: '',
  });
  const nameInput = useRef();
  const nicknameInput = useRef();
  //{current:undefined}

  const { name, nickname } = inputs;
  const onChange = (e) => {
    const { value, name } = e.target;

    setInputs({
      ...inputs, //기존의 input 객체를 복사한 뒤
      [name]: value, // name키를 가진 값을 value로 설정
    });
  };

  useEffect(() => {
    nameInput.current.focus();
  }, []);
  //nameInput = {current: undefined>>input으로....} 암기, DOM 객체에 직접 접근

  const onReset = () => {
    setInputs({
      name: '',
      nickname: '',
    });

    //nameInput.current.focus();
    nicknameInput.current.focus();
  };

  return (
    <div>
      <input
        name="name"
        placeholder="이름"
        onChange={onChange}
        value={name}
        ref={nameInput}
      ></input>
      <input
        name="nickname"
        placeholder="별명"
        onChange={onChange}
        value={nickname}
        ref={nicknameInput}
      ></input>
      <button onClick={onReset}>초기화</button>
    </div>
  );
};

export default RefDom;
