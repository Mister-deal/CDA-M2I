import albumsSlice from "./components/albums/albumsSlice";
import authSlice from "./components/auth/authSlice";
import { configureStore } from "@reduxjs/toolkit";



export default configureStore({
    reducer: {
        auth: authSlice,
        albums: albumsSlice
    }
})