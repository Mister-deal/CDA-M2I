package com.example.exo.servlet;

import com.example.exo.models.Product;
import com.example.exo.service.ProductService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet(name = "product", value = "/product")
public class ServletProduct extends HttpServlet {

    private List<Product> productList;
    private ProductService productService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        productList = productService.findAll();
        req.setAttribute("products", productList);
        req.getRequestDispatcher("product-list.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    public void init() throws ServletException {
        productService = new ProductService();
        productList = new ArrayList<>();
       /* Product product = new Product("ecran plat", 10, 529.99, new Date(2023-12-10));
        Product product1 = new Product("ecran pc", 15, 169.99, new Date(2023-4-10));
        Product product2 = new Product("toaster", 8, 52.30, new Date(2023-11-10));
        Product product3 = new Product("ordinateur portable", 5, 750.99, new Date(2023-9-10));
        Product product4 = new Product("chaine hi-fi", 10, 529.99, new Date(2023-7-10));
        Product product5 = new Product("cafetière", 25, 99.99, new Date(2023-2-10));
        productList.add(product);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        */
    }
}
