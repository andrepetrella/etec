document.addEventListener("DOMContentLoaded", function() {
    var num1 = document.getElementById("n1");
    var num2 = document.getElementById("n2");
    const resultado = document.getElementById("resultado");
    const button = document.getElementById("somar");

    button.addEventListener("click", function() {

        const val1 = parseFloat(num1.value);
        const val2 = parseFloat(num2.value);

        if (!isNaN(val1)) {
            num1.style.backgroundColor = "#5CE65C";
        } else {
            num1.style.backgroundColor = "#FF2C2C";
        }

        if (!isNaN(val2)) {
            num2.style.backgroundColor = "#5CE65C";
        } else {
            num2.style.backgroundColor = "#FF2C2C";
        }

        if (!isNaN(val1) && !isNaN(val2)) {
            const soma = val1 + val2;
            resultado.style.fontFamily = "Old English Text MT"
            resultado.textContent = soma;
        } else {
            
            resultado.style.fontFamily = "Lucida Handwriting";
            resultado.textContent = "Digite valores válidos.";
        }

    });
});

function somar(n1, n2) {
    return n1 + n2;
}
