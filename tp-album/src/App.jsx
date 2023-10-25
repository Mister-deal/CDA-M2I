import { useEffect, useState } from 'react'
import './App.css'
import { useDispatch } from 'react-redux'
import SignForm from './components/auth/SignForm'
import { useSelector } from 'react-redux'
import Modal from './components/shared/Modal'
import { fetchAlbums, setFormMode } from './components/albums/albumsSlice'
import AddAlbumForm from './components/albums/AddAlbumForm'
import NavBar from './components/shared/NavBar'
import AlbumDisplay from './components/albums/AlbumDisplay'
import EditAlbumForm from './components/albums/EditAlbumForm'
import DeleteAlbumForm from './components/albums/DeleteAlbumForm'

function App() {
  const dispatch = useDispatch()
  const albums = useSelector(state => state.albums.albums)
  const formMode = useSelector(state => state.albums.formMode)
  const user = useSelector(state => state.auth.user)

  useEffect(() => {
    dispatch(fetchAlbums())
    console.log(albums);
  }, [])
  return (
    <>
    {formMode === "add" && <Modal onClose={() => dispatch(setFormMode(""))}><AddAlbumForm/></Modal>}
      {formMode === "edit" && <Modal onClose={() => dispatch(setFormMode(""))}><EditAlbumForm/></Modal>}
      {formMode === "delete" && <Modal onClose={() => dispatch(setFormMode(""))}><DeleteAlbumForm/></Modal>}
      <header>
        <NavBar />
      </header>
      <main className='container'>
        <div className='row my-3'>
          <div className='col bg-dark rounded text-light p-3'>
            <div className='d-flex justify-content-between align-items-center'>
              <h3>Album List</h3>
              {user && <button className='btn btn-success' onClick={() => dispatch(setFormMode("add"))}>Add</button>}
            </div>
            <hr />
            {
              albums.length === 0 ? (
                <p>Il n'y a pas d'albums présents</p>
              ) : albums.map(album => <AlbumDisplay key={album.id} album={album} />)
            }
          </div>
        </div>
      </main>
    </>
  )
}

export default App
