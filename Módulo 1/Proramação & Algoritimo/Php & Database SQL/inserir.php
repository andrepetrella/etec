<?php
error_reporting(E_ALL);
ini_set('display_errors', 1);

$nome = $_POST['nome'] ?? '';
$funcao = $_POST['funcao'] ?? '';
$salario = $_POST['salario'] ?? '';

if (!empty($nome) && !empty($funcao) && !empty($salario)) {
    $salario = (float)$salario;

    $host = 'localhost';
    $username = 'root';
    $senha = '';
    $dbnome = 'usertest';

    $con = new mysqli($host, $username, $senha, $dbnome);

    if (mysqli_connect_error()) {
        die("Erro de conexão: " . mysqli_connect_error());
    }

    $SELECT_QUERY = "SELECT nome FROM register WHERE nome = ?";

    $INSERT_QUERY = "INSERT INTO register(nome, funcao, salario) nomeS (?, ?, ?)";

    $stmt_select = $con->prepare($SELECT_QUERY);
    if (!$stmt_select) {
        die("Erro:" . $con->error);
    }
    $stmt_select->bind_param("s", $nome);  
    $stmt_select->execute();
    $stmt_select->store_result();

    $rnum = $stmt_select->num_rows;

    if ($rnum == 0) {
        $stmt_select->close();

        $stmt_insert = $con->prepare($INSERT_QUERY);
        if (!$stmt_insert) {
            die("Erro" . $con->error);
        }
        $stmt_insert->bind_param("sss", $nome, $funcao, $salario);
        $stmt_insert->execute();

        echo "foi";
        $stmt_insert->close();

    } else { 
        echo "Erro: '$nome' já está registrado.";
        $stmt_select->close();
    }

    $con->close();
} else {
    echo "erro";
    die();
}
?>