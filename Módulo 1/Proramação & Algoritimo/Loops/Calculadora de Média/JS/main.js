document.addEventListener("DOMContentLoaded", function() {
    var n1 = document.getElementById("in1");
    var n2 = document.getElementById("in2");
    var n3 = document.getElementById("in3");
    var n4 = document.getElementById("in4");
    var calculate = document.getElementById("calc");
    var res = document.getElementById("res");

    let soma_das_notas = 0.0;
    let media = 0.0;

    calculate.addEventListener("click", function() {
        let number1 = Number(n1.value);
        let number2 = Number(n2.value);
        let number3 = Number(n3.value);
        let number4 = Number(n4.value);
        let did = false;

        soma_das_notas = number1 + number2 + number3 + number4;
        media = soma_das_notas / 4;

        if (number1 <= 10 && number2 <= 10 && number3 <= 10 && number4 <= 10) {
            if (number1 >= 0 && number2 >= 0 && number3 >= 0 && number4 >= 0) {
                media = soma_das_notas / 4;
                res.textContent = "Média final: " + media;
                did = true;
            }
            else {
                res.textContent = "Notas precisam ser maiores que 0.";
            }
        }
        else {
            res.textContent = "Notas precisam ser menor que 10.";
        }

        let situacao;
        let sit = document.getElementById("sit");
        media >= 7 ? situacao = "Aprovado" : situacao = "Reprovado";
        sit.textContent = "Situação: " + situacao;
    });
});