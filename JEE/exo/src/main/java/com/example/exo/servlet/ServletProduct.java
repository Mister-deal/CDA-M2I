package com.example.exo.servlet;

import com.example.exo.models.Product;
import com.example.exo.service.ProductService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet("/")
@MultipartConfig(maxFileSize = 1024*1024*10)
public class ServletProduct extends HttpServlet {

    private ProductService productService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getServletPath();

        try {
            switch (action) {
                case "/new":
                    showNewForm(req, resp);
                    break;
                case "/insert":
                    insertProduct(req, resp);
                    break;
                case "/delete":
                    deleteProduct(req, resp);
                    break;
                case "/edit":
                    showEditForm(req, resp);
                    break;
                case "/details":
                    showProduct(req, resp);
                    break;
                case "/update":
                    updateProduct(req, resp);
                    break;
                case "/list":
                    listProduct(req, resp);
                    break;
                default:
                    listProduct(req, resp);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }


    public void init() {
        productService = new ProductService();
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("form-product.jsp");
        dispatcher.forward(request, response);
    }

    private void showProduct(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {

        if(request.getParameter("id") != null) {
            int id = Integer.parseInt((request.getParameter("id")));
            Product product = productService.findById(id);
            request.setAttribute("product", product);
            request.getRequestDispatcher("product.jsp").forward(request,response);
        }
        else {
            request.setAttribute("products", productService.findAll());
            request.getRequestDispatcher("product-list.jsp").forward(request,response);
        }
    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        request.setAttribute("products", productService.findAll());
        request.getRequestDispatcher("product-list.jsp").forward(request,response);
    }
    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {


    }

    private void insertProduct(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {

        String name = request.getParameter("name");
        int stock = Integer.parseInt(request.getParameter("stock"));
        double price = Double.parseDouble(request.getParameter("price"));
        LocalDate date = LocalDate.parse(request.getParameter("date"));
        Product prod = new Product();

        String uploadPath = getServletContext().getRealPath("/") + "images";
        File file = new File(uploadPath);

        if (!file.exists()) {
            file.mkdir();
        }

        Part image = request.getPart("image");
        String fileName = image.getSubmittedFileName();
        image.write(uploadPath + File.separator + fileName);
        System.out.println("Image saved at: " + uploadPath + File.separator + fileName);



        Product product = new Product(name,stock, price, Date.from(date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()), fileName);

        if(productService.create(product)) {
            response.sendRedirect("list");
        }else{
            response.sendRedirect("form-product.jsp");
        }

    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product prod =  productService.findById(id);
        if(prod != null){
            String name = request.getParameter("name");
            int stock = Integer.parseInt(request.getParameter("stock"));
            double price = Double.parseDouble(request.getParameter("price"));
            LocalDate date = LocalDate.parse(request.getParameter("date"));
            //String urlImg = request.getParameter("urlImg");
            Product product = new Product(name,stock, price, Date.from(date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
        }
        productService.update(prod);
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product produit = productService.findById(id);
        if(produit != null){
            productService.delete(produit);
        }
        response.sendRedirect("list");
    }
}
