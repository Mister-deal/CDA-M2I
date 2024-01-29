package com.example.tp_hopital.servlet;

import com.example.tp_hopital.entities.User;
import com.example.tp_hopital.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "user", value = "/user")
public class UserServlet extends HttpServlet {

    private UserService userService;

    @Override
    public void init() throws ServletException {
        userService = new UserService();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String mdp = req.getParameter("mdp");
        String nom = req.getParameter("nom");

        if(email != null && mdp != null && nom != null){
            User user1 = new User(email,nom,mdp);
            if(userService.create(user1)){
                resp.sendRedirect("login.jsp");
            }else{
                resp.sendRedirect("register.jsp");
            }

        }else if(email != null && mdp != null){
            User user2 = new User(email,mdp);
            User user3 =  userService.getByEmailPassword(user2);
            if(user3 != null){
                HttpSession session = req.getSession();
                session.setAttribute("isLogged", true);
                session.setAttribute("name",user3.getNom());
                resp.sendRedirect("list");
            }else{
                HttpSession session = req.getSession();
                session.setAttribute("loginError", "Identifiants invalides.");
                resp.sendRedirect("login.jsp");
            }

        }else{
            resp.sendRedirect("login.jsp");
        }



    }
}
