<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="model.Client" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<header>
<a href="Accueil.jsp" class="d-flex justify-content-center"><img src="https://zupimages.net/up/22/26/nfnq.jpg" height="200"></a>
<nav class="navbar-dark bg-primary ">
      <ul class="nav justify-content-around">
        <li class="nav-item"> <a class="nav-link" href="Accueil.jsp">Accueil</a></li>
        <li class="nav-item"> <a class="nav-link" href="Menu.jsp">Menu</a> </li>
        <% 
       	Client c = (Client)session.getAttribute("client");
       	if (c == null){
       		out.print("<li class='nav-item'> <a class='nav-link' href='Connexion.jsp'>Connexion/Inscription</a> </li>");
       	} else {
       		out.print("<li class='nav-item'> <a class='nav-link' href='ServletAccesCommande'>Commande</a> </li>");
       		out.print("<li class='nav-item'> <a class='nav-link' href='ServletDeconnexion'>Deconnexion</a> </li>");
       	}
       
       	%>
      </ul>
</nav>
</header>
