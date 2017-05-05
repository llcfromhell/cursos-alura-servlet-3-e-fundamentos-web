<html>
<body>
	Bem vindo ao nosso gerenciador de empresas!
	<br />

	<form action="novaEmpresa" method="post">
		Nome: <input type="text" name="nome" /><br /> <input type="submit"
			value="Adicionar empresa" />
	</form>

	<form action="login" method="post">

		<label>Email:</label> <input type="text" name="email" /><br /> <label>Senha:</label>
		<input type="password" name="senha" /><br /> <input type="submit"
			value="Login" />

	</form>

	<form action="logout" method="post">
		<input type="submit" value="Logout" />
	</form>

</body>
</html>