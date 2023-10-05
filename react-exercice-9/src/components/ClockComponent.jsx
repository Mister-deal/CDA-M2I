import { useEffect, useState } from "react";
import clockSound from './assets/sounds/80s-alarm-clock-sound.mp3'
const ClockComponent = () => {
    const [clockValue, setClockValue] = useState(0)
    function playSound() {
        const newSound = new Audio(clockSound)
        newSound.play()
    }
    useEffect(() => {
        let timer = setInterval(() => {
            console.log("Timer Updated");
            setClockValue(clockValue + 1)
        }, 1000)

        return() => {
            if(timer) {
                clearInterval(timer)
                timer = undefined
            }
            if(timer === 300){
                playSound()
            }
        }
    })
    return(
        <>
            <h1>{clockValue}</h1>
        </>
    )
}
export default ClockComponent