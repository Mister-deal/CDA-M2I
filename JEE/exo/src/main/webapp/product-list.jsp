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
    <jsp:include page="includes/head.jsp" />
</head>
<body>
<jsp:include page="includes/header.jsp"/>
<div class="container mt-4">
    <center>
        <h2>Liste des produits </h2>
    </center>
    <div class="m-4">
        <a href="new" class="btn btn-success text-start">Add Product </a>
    </div>


    <center>
        <table border="1" cellpadding="5" class="table table-dark text-center" >
            <tr>
                <th>Marque</th>
                <th>Reference</th>
                <th>Prix</th>
                <th>Stock</th>
                <th>Date achat</th>
                <th >Actions</th>
            </tr>
            <c:if test="${products != null}">
                <c:forEach items="${products}" var="product">
                    <tr>
                        <td>${product.getName()}</td>
                        <td>${product.getPrice()} €</td>
                        <td>${product.getStock()}</td>
                        <td>${product.getDate()}</td>
                        <td>
                            <a href="edit?id=${product.getId()}" class="btn btn-info">Edit</a>
                            <a href="delete?id=${product.getId()}" class="btn btn-danger">Delete</a>
                            <a href="details?id=${product.getId()}" class="btn btn-primary">Detail</a>
                        </td>
                    </tr>
                </c:forEach>
            </c:if>
        </table>
    </center>
</div>


</body>
</html>