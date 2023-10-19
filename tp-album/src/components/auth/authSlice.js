import { createAsyncThunk, createSlice } from "@reduxjs/toolkit";
import { SIGN_IN_URL, SIGN_UP_URL } from "../../fireBaseConfig";

export const SignUpUser = createAsyncThunk(
  "auth/SignUpUser",
  async ( credentials ) => {
    const response = await fetch(SIGN_UP_URL, {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(credentials),
    });
    const data = await response.json();
    return data;
  }
);

export const SignInUser = createAsyncThunk(
    "auth/SignInUser",
    async ( credentials ) => {
      const response = await fetch(SIGN_IN_URL, {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(credentials),
      });
      const data = await response.json();
      return data;
    }
  );


const authSlice = createSlice({
  name: "auth",
  initialState: {
    user: null,
    authMode: "Sign in",
  },
  reducers: {
    changeAuthMode : (state, action) => {
        state.authMode = action.payload
    },
    removeUser : (state, action) => {
        state.user = null
        localStorage.removeItem("token")
    }
  },
  extraReducers: (builder) => {
    builder.addCase(SignInUser.fulfilled, (state, action) => {
      state.user = action.payload;
      localStorage.setItem("token", action.payload.idToken)
    });
    builder.addCase(SignUpUser.fulfilled, (state, action) => {
      state.user = action.payload;
    });
  },
});

export default authSlice.reducer
export const { changeAuthMode, removeUser} = authSlice.actions