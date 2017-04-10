<?php

$connection = mysqli_connect('localhost', 'root', 'fiap', 'cms');

if (!$connection) {
    echo 'Erro ao solicitar conexão com o banco de dados.';
}