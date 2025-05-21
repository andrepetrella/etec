document.addEventListener("DOMContentLoaded", function(){
    let a, b, c;
    const bot = document.getElementById("cl");

    bot.addEventListener("click", function() {
        let aIn = document.getElementById("a1");
        let bIn = document.getElementById("b1");
        let cIn = document.getElementById("c1");

        a = Number(aIn.value);
        b = Number(bIn.value);
        c = Number(cIn.value);

        let delta = (b * b) - 4 * a * c;

        document.getElementById("way1").textContent = "x = (-(" + b + ") +- (" + (b * b) + " - 4 * " + a + " * " + c + ")^0.5) / 2 * " + a; 
        document.getElementById("way2").textContent = "x1 = (-(" + b + ") + (" + delta + ")^0.5) / " + 2 * a;
        document.getElementById("way3").textContent = "x2 = (-(" + b + ") - (" + delta + ")^0.5) / " + 2 * a;
        document.getElementById("way4").textContent = "x = (-(" + b + ") +- " + Math.sqrt(delta) + ") / " + 2 * a;
        let x1 = (-(b) + Math.sqrt(delta)) / 2 * a;
        let x2 = (-(b) - Math.sqrt(delta)) / 2 * a;

        document.getElementById("x1").textContent = "x1 = " + x1;
        document.getElementById("x2").textContent = "x2 = " + x2;
    })
})