package com.example.exo.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(name = "notprotected", value = "/notprotect")
public class NotProtectedServlet extends HttpServlet {


}
