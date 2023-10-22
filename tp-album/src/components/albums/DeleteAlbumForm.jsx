import { useDispatch } from "react-redux"
import { useRef, useSelector, useEffect } from "react"
import { deleteAlbum, setFormMode } from "./albumsSlice"


const DeleteAlbumForm = () => {
    const dispatch = useDispatch
    const token = localStorage.getItem("token")
    const titleRef = useRef()
    const dateRef = useRef()
    const artistRef = useRef()
    const scoreRef = useRef()
    const urlRef = useRef()
    const selectedAlbum = useSelector(state => state.albums.selectedAlbum)

    useEffect(() => {
        if(selectedAlbum){
            titleRef.current.value = selectedAlbum.title
            dateRef.current.value = selectedAlbum.date
            artistRef.current.value = selectedAlbum.artist
            scoreRef.current.value = selectedAlbum.score
            urlRef.current.value = selectedAlbum.url
        }
    }, [
        selectedAlbum.title,
        selectedAlbum.date,
        selectedAlbum.artist,
        selectedAlbum.score,
        selectedAlbum.url
    ])
    

    const submitFormHandler = async (e) =>{
        e.preventDefault()

        if(token){
            dispatch(deleteAlbum(selectedAlbum))
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

export default DeleteAlbumForm