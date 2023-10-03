import { useState } from "react";

const InputComponent = () => {
  const [valueSurname, setValueSurname] = useState("");
  const [valueName, setValueName] = useState("");

  const changeValueName = (e) => {
    setValueName((prevState) => e.target.value);
  };
  const changeValueSurname = (e) => {
    setValueSurname((prevState) => e.target.value);
  };

  return (
    <>
      <h1>Bonjour</h1>
      <hr />
      <input type="text" onInput={changeValueName} />
      <input type="text" onInput={changeValueSurname} />
      <p>
        votre prénom est : <b>{valueName}</b>
      </p>
      <p>
        votre nom est : <b>{valueSurname}</b>
      </p>
      <p>
        Bienvenue,{" "}
        <b>
          {valueName.charAt(0).toUpperCase()}
          {valueName.slice(1)} {valueSurname.toUpperCase()}
        </b>{" "}
        vous voilà désormais dans l'application
      </p>
    </>
  );
};

export default InputComponent;
