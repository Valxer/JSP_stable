<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modify/Remove Article</title>
</head>
<body>
	<form action = "Edit" method="post">
			<label for="idref">R�f�rence :</label>
			<input name = "ref" id="idref" type ="number" value=<c:out value="${editarticle.ref }" /> readonly/><br><br>
			
			<label for="idnom">Nom :</label>
			<input name = "nom" id="idnom" type ="text" value=<c:out value="${editarticle.nom }" />  required/><br><br>
			
			<label for="iddesc">Description :</label>
			<input name = "desc" id="iddesc" type ="text" value=<c:out value="${editarticle.description }" /> required/><br><br>
			
			<label for="idprix">Prix :</label>
			<input name = "prix" id="idprix" type ="number" value=<c:out value="${editarticle.prix }" /> required/><br><br>
			
			<label for="idimg">URL Image :</label>
			<input name = "img" id="idimg" type ="text" value=<c:out value="${editarticle.image }" /> required/><br><br>
		
			<input type = "submit" value ="Modifier article" class="btn btn-primary"/>
			<a href="Delete">Supprimmer article</a>
		</form>
</body>
</html>