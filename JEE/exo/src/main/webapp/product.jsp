
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Produit ${product.getId()}</title>
    <jsp:include page="includes/head.jsp" />
</head>
<body>
<jsp:include page="includes/header.jsp" />
<div class="container">
    <center>
        <div class="card" style="width: 18rem;">
            <img src="" class="card-img-top" alt="...">
            <div class="card-body">
                <h5 class="card-title">Nom : ${product.getName()}</h5>
            </div>
            <ul class="list-group list-group-flush">
                <li class="list-group-item">${product.getPrice()} €</li>
                <li class="list-group-item">${product.getStock()}</li>
                <li class="list-group-item">${product.getDate()}</li>
            </ul>
            <div class="card-body">
                <a href="list" class="btn btn-primary">Retour</a>
                <a href="delete?id=${product.getId()}" class="btn btn-danger">Delete</a>
            </div>

        </div>
    </center>
</div>
</body>