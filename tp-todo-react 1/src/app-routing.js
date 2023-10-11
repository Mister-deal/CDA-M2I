import App from "./App";
import ListComponent from "./routes/ListComponent";
import FormComponent from "./routes/FormComponent";
import {createBrowserRouter} from "react-router-dom"

const router = createBrowserRouter([
    {
        path: "/",
        element: <App />
    },
    // {
    //     path: "/list",
    //     element: <ListComponent />
    // }

])
export default router