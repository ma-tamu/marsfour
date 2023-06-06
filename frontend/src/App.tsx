import {BrowserRouter, Route, Routes} from "react-router-dom";
import User from "./pages/User.tsx";
import NotFound from "./errors/NotFound.tsx";
import Home from "./pages/Home.tsx";
import Welcome from "./pages/Welcome.tsx";

function App() {
    return (
        <>
            <BrowserRouter>
                <Routes>
                    <Route path={"/"} element={<Home/>}/>
                    <Route path={"/welcome"} element={<Welcome/>}/>
                    <Route path={"users/:id"} element={<User/>}/>
                    <Route path={"*"} element={<NotFound/>}/>
                </Routes>
            </BrowserRouter>
        </>
    );
}

export default App
