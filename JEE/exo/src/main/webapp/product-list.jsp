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
</c:forEach>
</body>
</html>
