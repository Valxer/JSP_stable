<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Recap Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
</head>
<body>
<%@ include file="../header.jsp" %>
	<h3>La commande de <c:out value="${client.nom} ${client.prenom}" /></h3>
	<table border="1" class="table table-striped">
		<thead class="thead-dark">
			<tr>
			    <th>Articles</th>
			    <th>Quantité</th>
			    <th>Prix </th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="achat" items="${panier }">	
			    <tr>
			    	<td><c:out value="${achat.nomart }" /></td>
			    	<td><c:out value="${achat.quantite }" /></td>
		            <td><c:out value="${achat.total } " />&euro;</td>
			    </tr>
			</c:forEach>
				<tr>
					<td>Total : </td>
					<td colspan="2"><c:out value="${totalp } "/>&euro;</td>
				</tr>
		</tbody>
	</table>
	<div class="d-flex justify-content-center">
		<a class="btn btn-success" href="OrderCompleted" role="button">Finaliser la commande</a>
	</div>
</body>
</html>