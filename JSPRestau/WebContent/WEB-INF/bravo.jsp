<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Restaurant | Order Completed</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
</head>
<body>
	<%@ include file="../header.jsp" %>
	<h1>Votre commande a bien �t� valid�e ! </h1>
	<p>Num�ro de commande :
	<%= session.getAttribute("p")%>
	</p>
	<p>Elle sera livr�e aussi rapidement que possible � votre adresse : <c:out value="${client.adresse}"/></p>
	
	<%@ include file="../footer.jsp" %>
</body>
</html>