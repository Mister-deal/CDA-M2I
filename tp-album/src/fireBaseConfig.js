// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAnalytics } from "firebase/analytics";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyCKUSrsjJcROkkOTLLexzCxv703Z5gk8Gg",
  authDomain: "projet-test-6615f.firebaseapp.com",
  databaseURL: "https://projet-test-6615f-default-rtdb.europe-west1.firebasedatabase.app",
  projectId: "projet-test-6615f",
  storageBucket: "projet-test-6615f.appspot.com",
  messagingSenderId: "847853104793",
  appId: "1:847853104793:web:1a23be288b603209909208",
  measurementId: "G-G9R86XDT79"
};
export const SIGN_UP_URL = `https://identitytoolkit.googleapis.com/v1/accounts:signUp?key=${firebaseConfig.apiKey}`
export const SIGN_IN_URL = `https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?key=${firebaseConfig.apiKey}`
export const BASE_DB_URL = firebaseConfig.databaseURL

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);