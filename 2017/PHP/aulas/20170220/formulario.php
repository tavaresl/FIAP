<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>PHP</title>
</head>
<body>
	<?php
		if (isset($_POST['enviar'])) {
			$usr = $_POST['usuario'];
			$psw = $_POST['senha'];

			if (strlen($usr) < 5) {
				echo 'Nome pequeno demais, parceiro.';
			}
			if (strlen($usr) > 15) {
				echo 'Nome grande demais, parceiro';
			}
		}
	?>
	<form class="" action="formulario.php" method="post">
		<input type="text" name="usuario" placeholder="Usuário"><br>
		<input type="password" name="senha" placeholder="Senha"><br>
		<input type="submit" value="Enviar">
	</form>
</body>
</html>
