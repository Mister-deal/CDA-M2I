import React, { useState } from "react";

const ClockForm = ({onClockCreate}) => {
    const [clockName, setClockName] = useState('');
    const [clockDuration, setClockDuration] = useState('');

    const handleSubmit = (e) => {
        e.preventDefault();
        onClockCreate({name: clockName, duration: clockDuration});
        setClockName('');
        setClockDuration('');
    }

    return(
        <form onSubmit={handleSubmit}>
            <label htmlFor="Clock-name">
                Clock Name:
                <input type="text" value={clockName} onChange={(e) => setClockName(e.target.value)} />
            </label>
            <label htmlFor="Clock-duration">
                Clock Duration:
                <input type="text" value={clockDuration} onChange={(e) => setClockDuration(e.target.value)} />
            </label>
            <button type="submit">Create Clock</button>
        </form>
    )
}
export default ClockForm