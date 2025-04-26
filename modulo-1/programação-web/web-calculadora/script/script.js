document.addEventListener("DOMContentLoaded", function() {
    var num1 = document.getElementById("n1");
    var num2 = document.getElementById("n2");
    const button = document.getElementById("somar");

    button.addEventListener("click", function() {
    if (num1 === "" || num2 === "") {
        document.getElementById("resultado").textContent = "ERROR!!!";
    }
    else {
        var soma = somar(Number(num1.value), Number(num2.value));
        document.getElementById("resultado").textContent = soma;
    }
});
});

function somar(n1, n2) {
    return n1 + n2;
}
