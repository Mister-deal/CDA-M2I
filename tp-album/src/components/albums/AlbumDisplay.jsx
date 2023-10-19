import { useDispatch, useSelector } from "react-redux"
import { setFormMode, setSelectedAlbum } from "./albumsSlice"



const AlbumDisplay = (props) => {
    const album = props.album
    const dispatch = useDispatch()
    const user = useSelector(state => state.auth.user)

    const editAlbumHandler = () => {
        dispatch(setSelectedAlbum(album))
        dispatch(setFormMode("edit"))
    }
    const deleteAlbumHandler = () => {
        dispatch(setSelectedAlbum(album))
        dispatch(setFormMode("delete"))
    }

    return (
    <>
      <div className="card">
        <div className="card-header text-center">
          <h2>{album.title}</h2>
        </div>
        <img src={album.url} alt={album.title + " cover"} />
        <div className="card-footer">
          <p>
            <b>Artiste:</b> {album.artist}
          </p>
          <hr />
          <p>
            <b>Release date:</b>{" "}
            {album.date}
          </p>
          <hr />
          <p>
            <b>Score:</b> {album.score}
          </p>
          {user && (
            <>
              <button
                type="button"
                className="btn btn-warning"
                onClick={() => {
                    dispatch(setFormMode("edit"))
                }}
              >
                Edit
              </button>
              <button
                type="button"
                className="btn btn-danger"
                onClick={() => {
                  dispatch(setFormMode("delete"))
                }}
              >
                Delete
              </button>
            </>
          )}
        </div>
      </div>
    </>
  );
}
export default AlbumDisplay