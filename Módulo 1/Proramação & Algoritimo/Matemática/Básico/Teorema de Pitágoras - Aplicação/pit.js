document.addEventListener("DOMContentLoaded", function() {
    let c1 = document.getElementById("c1");
    let c2 = document.getElementById("c2");

    let but = document.getElementById("but");
    but.addEventListener("click", function() {
        cat1 = Number(c1.value);
        cat2 = Number(c2.value);
        hip = cat1 * cat1 + cat2 * cat2;
        hip = Math.sqrt(hip);
        document.getElementById("hip").textContent = "Hipotenusa = " + hip; 
    });
});