import { useRef } from "react";

const FormRender = (props) => {
    const usernameInputReference = useRef();

    const mailInputReference = useRef();

    const getValueFromInput = () => {
        props.logInfo(usernameInputReference.current.value)
        props.logInfo(mailInputReference.current.value)
    }

    return(
        <>
            <div>
                <label htmlFor="username">Username: </label>
                <input type="text" ref={usernameInputReference} />
            </div>
            <div>
                <label htmlFor="mail">Mail: </label>
                <input type="text" ref={mailInputReference} />
            </div>

            <div>
                <button onClick={getValueFromInput}>click to get value</button>
            </div>
        </>
    )
}
export default FormRender