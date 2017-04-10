<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Funções string</title>
</head>
<body>
	<?php
		$string = 'Faltam 5 dias para o carnaval!';
		$stringNome = 'lucas';

		// Conta a quantidade de caracteres
		echo strlen($string);
		echo '<br>';

		// Converte para caixa alta
		echo strtoupper($stringNome);
		echo '<br>';

		// Converte para caixa baixa
		echo strtolower($string);
		echo '<br>';

		if (strstr($string, '!')) {
			echo 'Eba! Encontrei o que eu queria!';
		}
		else {
			echo 'Ah!... não tem ponto de exclamação!';
		}
	 ?>
</body>
</html>
