var max_speed = 50; // km/h
var charge = 0; // percentage
var current_speed = parseFloat(prompt("Velocidade (km/h): "));
var total = 0.0;

if (current_speed >= 0) {
    if (current_speed > max_speed) {
        if (current_speed <= (max_speed + 10)) { // 60
            charge = 15;
        }
        else if (current_speed <= (max_speed + 20)) {
            charge = 25;
        }
        else if (current_speed <= (max_speed + 30)) {
            charge = 35;
        }
        else {
            charge = 50;
        }

        total = 250 + (250 * (charge / 100));
        console.log("Valor total da multa: $" + total);
    }
    else {
        console.log("Tudo OK.");
    }
}
else {
    console.log("Erro. Velocidade não pode ser menor que 0.");
}