<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 23/01/2024
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>product</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<h1>List of products :</h1>
<c:forEach items="${products}" var="product">

    <div>
        Id: ${product.getId()}
        Name: ${product.getName()}
        Stock: ${product.getStock()}
        Price: ${product.getPrice()}
        Date: ${product.getDate()}
    </div>

    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">Stock</th>
            <th scope="col">Price</th>
            <th scope="col">Date</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th scope="row">1</th>
            <td>${product.getName()}</td>
        </tr>
        <tr>
            <th scope="row">2</th>
            <td>${product.getStock()}</td>
        </tr>
        <tr>
            <th scope="row">3</th>
            <td>${product.getPrice()}</td>
        </tr>
        <tr>
            <th scope="row">4</th>
            <td>${product.getDate()}</td>
        </tr>
        </tbody>
    </table>
</c:forEach>
</body>
</html>
