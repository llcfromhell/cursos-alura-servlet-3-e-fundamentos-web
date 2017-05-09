<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<body>
	Bem vindo ao nosso gerenciador de empresas!

	<c:if test="${usuarioLogado!=null}">
		<h5>
    	Você está logado como ${usuarioLogado.email}
    	</h5>
	</c:if>

	<br />

	<form action="FazTudo" method="post">
		<input type="hidden" name="tarefa" value="NovaEmpresa" /> 
		<label>Nome:</label>
		<input type="text" name="nome" /><br /> <input type="submit" value="Adicionar empresa" />
	</form>

	<form action="login" method="post">

		<label>Email:</label> <input type="text" name="email" /><br /> <label>Senha:</label>
		<input type="password" name="senha" /><br /> <input type="submit"
			value="Login" />

	</form>

	<form action="executa" method="post">
		<input type="hidden" name="tarefa" value="Logout" />
		<input type="submit" value="Logout" />
	</form>

</body>
</html>