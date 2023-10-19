import { BASE_DB_URL } from "../../fireBaseConfig"
import { createAsyncThunk, createSlice, } from "@reduxjs/toolkit"

export const fetchAlbums = createAsyncThunk(
    "album/fetchAlbums",
    async () => {
        const response = await fetch(BASE_DB_URL + "/albumList.json")
        const data = await response.json()
        const albums = []
        for (const key in data){
            albums.push({id:key, ...data[key]})
        }
        return albums
    }
)

export const postAlbum = createAsyncThunk(
    "album/postAlbum",
    async (newAlbum) => {
        const token = localStorage.getItem("token")
        const response = await fetch(BASE_DB_URL + `/albumList.json?auth=${token}`, {
            method: "POST",
            headers: {
                "Content-Type": "application.json"
            },
            body: JSON.stringify(newAlbum)
        })
        const data = await response.json()
        return{
            id: data.name,
            ...newAlbum
        }
    }
)

export const editAlbum = createAsyncThunk(
    "album/editAlbum",
    async (editAlbum) => {
        const token = localStorage.getItem("token")
        const response = await fetch(`${BASE_DB_URL}/albumList/${deleteAlbum.id}.json?auth=${token}`, {
            method: "PATCH",
            headers: {
                "Content-Type": "application.json"
            },
            body: JSON.stringify(editAlbum)
        })

        if(!response.ok) {
            throw new Error("Something went wrong during the PATCH recipe request")
        }

        const data = await response.json()
        return editAlbum
    }
)
export const deleteAlbum = createAsyncThunk(
    "album/deleteAlbum",
    async (deleteAlbum) => {
        const token = localStorage.getItem("token")
        const response = await fetch(`${BASE_DB_URL}/albumList/${deleteAlbum.id}.json?auth=${token}`, {
            method: "DELETE"
        })
        const data = response.json()
        return deleteAlbum
    }
)

const albumsSlice = createSlice({
    name: "album",
    initialState: {
        formMode: "",
        albums: [],
        selectedAlbum: null
    },
    reducers: {
        //insert the selectedAlbum here
        setSelectedAlbum: (state, action) => {
            state.selectedAlbum = action.payload
        },
        setFormMode: (state, action) => {
            state.formMode = action.payload
        }
    },
    extraReducers: (builder) => {
        builder.addCase(fetchAlbums.fulfilled, (state, action) => {
            state.albums = action.payload
            console.log(state.albums);
        })
        builder.addCase(postAlbum.fulfilled, (state, action) => {
            state.albums.push(action.payload)
        })
        builder.addCase(deleteAlbum.fulfilled, (state, action) => {
            let foundAlbum = state.albums.find(album => album.id === action.payload.id)
            if (foundAlbum) {
                state.recipes = state.albums.filter(a => a.id !== action.payload.id)
            }
        })
    }
})

export default albumsSlice.reducer
export const { setSelectedAlbum, setFormMode } = albumsSlice.actions