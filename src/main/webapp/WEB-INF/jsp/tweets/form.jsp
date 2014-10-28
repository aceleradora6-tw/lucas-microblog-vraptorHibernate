<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tweets - Formulário de Inserção</title>
</head>
<body>
	<form action="/microblog/tweets/adiciona" method="POST">
		Mensagem: <input type="text" name="tweet.message"/>
		<input type="submit" value="Salvar"/>
	</form>
</body>
</html>