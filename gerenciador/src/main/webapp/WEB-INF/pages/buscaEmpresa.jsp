<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Busca empresa</title>
</head>
<body>

<ul>
<c:forEach var="empresa" items="${empresas}">
	<li>${empresa.id}: ${empresa.nome}</li>
</c:forEach>
</ul>
</body>
</html> 