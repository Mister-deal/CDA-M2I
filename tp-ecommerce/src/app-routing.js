import {createBrowserRouter} from "react-router-dom";
import ErrorPage from "./routes/ErrorPage";
import App from "./App"
import AddArticle from "./routes/AddArticle";
import Login from "./routes/Login";
import Cart from "./routes/Cart";
import DetailArticle from "./routes/DetailArticle";
import Home from "./routes/Home";
import ProtectedRoute from "./routes/ProtectedRoute";


const router = createBrowserRouter([
    {
        path: "/",
        element: <Home />,
        errorElement: <ErrorPage />,
        children: [
            {
                path: "/",
                element: <App />
            },
            {
                path: "/Add",
                element: <ProtectedRoute><AddArticle /></ProtectedRoute>
            },
            {
                path: "/Login",
                element: <Login />
            },
            {
                path: "/Cart",
                element: <Cart />
            },
            {
                path: "/detail/:id",
                element: <DetailArticle />
            },
        ]
    }
])
export default router