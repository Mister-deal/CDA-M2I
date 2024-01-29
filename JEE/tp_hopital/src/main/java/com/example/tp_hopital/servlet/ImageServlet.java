package com.example.tp_hopital.servlet;

import com.example.tp_hopital.entities.Patient;
import com.example.tp_hopital.service.PatientService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.OutputStream;

@WebServlet("/imageServlet")
public class ImageServlet extends HttpServlet {

        private PatientService service;

        public void init(){

            service = new PatientService();

        }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Patient patient = service.findById(id);
        response.setContentType("image/png");
        OutputStream out = response.getOutputStream();
        if (patient.getPhoto() != null) {
            out.write(patient.getPhoto());
        } else {
            out.write(null);
        }
        out.close();
    }
}
