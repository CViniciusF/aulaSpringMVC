<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<label>Endere�o: </label>
	<input type="text" name="RuaNroComp"><br/>
	<label>Bairro:</label>
	<input type="text" name="Bairro"><br/>
	<label>Cidade:</label>
	<input type="text" name="Cidade"><br/>
	<input type="submit" value="adicionar">
</form>
</body>
</html>