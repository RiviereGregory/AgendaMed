<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!--     pour utiliser les balises pour le java on fait des taglib -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- pour les jstl pour utiliser foreach entre autre-->
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test affichage liste patient</title>
</head>
<body>
	<table border="2" align="center">
		<tr>
			<th>Id</th>
			<th>Nom</th>
			<th>Prénom</th>
			<th>Date Naissance</th>
			<th>Adresse</th>
			<th>Numéro Téléphone</th>

		</tr>
		<c:forEach items="${patients}" var="p">
			<tr>
				<td>${p.id}</td>
				<td>${p.nom}</td>
				<td>${p.prenom}</td>
				<td><fmt:formatDate value="${p.dateNaissance}"
						pattern="dd/MM/yyyy" /></td>
				<td>${p.adresse}</td>
				<td>${p.numeroTelephone}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>