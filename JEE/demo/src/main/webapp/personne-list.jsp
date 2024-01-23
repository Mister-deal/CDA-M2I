<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 23/01/2024
  Time: 09:23
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Personne</title>
</head>
<body>

<h1>la liste des personnes</h1>

<c:forEach items="${personnes}" var="personne">

    <div>
        Nom: ${personne.getNom()}
        prenom: ${personne.getPrenom()}
    </div>
</c:forEach>

</body>
</html>
