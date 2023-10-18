import BASE_DB_URL from "../../fireBaseConfig.js"
import { createAsyncThunk, createSlice, } from "@reduxjs/toolkit"

export const albumsSlice = createAsyncThunk(
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
        const response = await fetch(BASE_DB_URL + "/albumList.json", {
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

// export const selectAlbum = createAsyncThunk(
//     "album/selectAlbum",
//     async () => {
//         const response = await fetch(BASE_DB_URL + "/albumList.json")
//         const data = await response.json()
//         const albums = []
//         for (const key in data){
//             albums.push({id:key, ...data[key]})
//         }
//         return albums
//     }
// )

export const editAlbum = createAsyncThunk(
    "album/editAlbum",
    async (editAlbum) => {
        const response = await fetch(BASE_DB_URL + "albumList.json", {
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
        return(
            id: data.name,
            ...editAlbum
        )
    }
)