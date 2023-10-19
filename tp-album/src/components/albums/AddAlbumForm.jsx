import { useRef } from "react"
import { useDispatch } from "react-redux"
import { postAlbum, setFormMode } from "./albumsSlice"


const AddAlbumForm = () => {

    const dispatch = useDispatch()
    const token = localStorage.getItem("token")

    const titleRef = useRef()
    const dateRef = useRef()
    const artistRef = useRef()
    const scoreRef = useRef()
    const urlRef = useRef()

    const submitFormHandler = async (e) =>{
        e.preventDefault()

        const newAlbum = {
            title: titleRef.current.value,
            date: dateRef.current.value,
            artist: artistRef.current.value,
            score: scoreRef.current.value,
            url: urlRef.current.value,
        }
        if(token){
            dispatch(postAlbum(newAlbum))
            console.table(newAlbum);
            dispatch(setFormMode(""))
        }
    }

    return(
        <>
        <h1>Add Album</h1>
            <hr />
            <form onSubmit={submitFormHandler}>
                <div className="mb-3">
                    <label htmlFor="title" className="form-label">Title:</label>
                    <input type="text" className="form-control" required ref={titleRef} placeholder="Return from the rainbow..."/>
                </div>
                <div className="mb-3">
                    <label htmlFor="cookTime" className="form-label">date:</label>
                    <input type="date" className="form-control" ref={dateRef}/>
                </div>
                <div className="mb-3">
                    <label htmlFor="artist" className="form-label">Artist name:</label>
                    <input type="text" className="form-control"  ref={artistRef} placeholder="Led Zeppelin"/>
                </div>
                <div className="mb-3">
                    <label htmlFor="score" className="form-label">score:</label>
                    <input type="number"  className="form-control" min={0} max={5} step={0.5} required ref={scoreRef}/>
                </div>
                <div className="mb-3">
                    <label htmlFor="url-album" className="form-label">Url album:</label>
                    <input type="url"  name="url" className="form-control" ref={urlRef} placeholder="https://google.com"/>
                </div>
                <div className="text-end">
                    <button className="btn btn-success">Add</button>
                </div>
            </form>
        </>
    )
}
export default AddAlbumForm
