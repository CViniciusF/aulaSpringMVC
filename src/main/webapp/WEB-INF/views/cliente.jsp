<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="adicionaCliente" method="post">
		<label>Nome: </label>
		<input type="text" name="Nome"><br/>
		<label>Endereço: </label>
		<input type="text" name="RuaNroComp"><br/>
		<label>Bairro:</label>
		<input type="text" name="Bairro"><br/>
		<label>Cidade:</label>
		<input type="text" name="Cidade"><br/>
		<input type="submit" value="adicionar">
	</form>
	<h2>Lista de Clientes</h2>
	<table action="listaClientes">
		<thead>
			<tr>
				<th>Nome:</th>
				<th>Endereço:</th>
				<th>Bairro:</th>
				<th>Cidade:</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${clientes}" var="c">
			<tr>
				<td>${c.nome}</td>
				<td>${c.ruaNroComp}</td>
				<td>${c.bairro}</td>
				<td>${c.cidade}</td>
			</tr>
			</c:forEach>
		<tbody>
	</table>
</body>
</html>