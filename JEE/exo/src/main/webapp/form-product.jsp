<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 24/01/2024
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add product</title>
    <jsp:include page="includes/head.jsp" />

</head>
<body>
<jsp:include page="includes/header.jsp"/>
<div class="container mt-4">
    <center>
        <h2>Add product </h2>
    </center>
    <div>
        <form action="insert" method="post">
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="inputEmail4">Brand</label>
                    <input type="text" class="form-control" id="inputEmail4" name="marque">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-4">
                    <label for="inputAddress">Price</label>
                    <input type="text" class="form-control" id="inputAddress" placeholder="12" name="price">
                </div>
                <div class="form-group col-md-4">
                    <label for="inputAddress2">Stock</label>
                    <input type="text" class="form-control" id="inputAddress2" placeholder="50" name="stock">
                </div>
                <div class="form-group col-md-4">
                    <label for="date">Date</label>
                    <input type="date" class="form-control" id="date" placeholder="50" name="date">
                </div>
            </div>
            <button type="submit" class="btn btn-primary">Validation</button>
        </form>
    </div>
</div>
</body>
</html>
