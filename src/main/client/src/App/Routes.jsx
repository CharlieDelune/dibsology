import React from "react";
import { BrowserRouter, Route } from "react-router-dom";
import { NavBar } from "./Components/NavBar/NavBar";
import { Home } from "./Components/Home/Home";
import { SubmissionList } from "./Components/Submission-List/Submission-List";
import { SubmissionPage } from "./Components/Submission-Page/Submission-Page";
import { UserPage } from "./Components/User-Page/User-Page";

const Routes = () => (
    <BrowserRouter>
        <NavBar />
        <div>
            <Route exact path="/" component={Home} />
            <Route exact path="/submissions" component={SubmissionList} />
            <Route exact path="/submission/:id" component={SubmissionPage} />
            <Route exact path="/user" component={UserPage} />
        </div>
    </BrowserRouter>
);

export default Routes;
