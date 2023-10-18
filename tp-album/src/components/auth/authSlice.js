import { createAsyncThunk } from "@reduxjs/toolkit";
import { SIGN_UP_URL } from "../../fireBaseConfig";


export const signUp = createAsyncThunk(
    "auth/signUp",
    async (credentials) => {
        const response = await fetch(SIGN_UP_URL, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(credentials)
    })
    const data = await response.json()
    return data
    }

)