var max_speed = 50; // km/h
var charge = 0; // percentage
var total = 0.0;
var current_speed = parseFloat(prompt("Velocidade (km/h): "));

checkSpeed(current_speed);

function checkSpeed(speed) {
    if (speed > 0) {
        if (speed > max_speed) {
            var caseS;
            if (speed <= (max_speed + 10)) {
                caseS = 1;
            }
            else if (speed <= (max_speed + 20)) {
                caseS = 2;
            }
            else if (speed <= (max_speed + 30)) {
                caseS = 3;
            }

            switch (caseS) {
                case 1:
                    charge = 15;
                break;
                case 2:
                    charge = 25;
                break;
                case 3:
                    charge = 35;
                break;
                default:
                    charge = 50;
                break;
            }

            total = 250 + (250 * (charge / 100));
            console.log("Valor da multa:  $" + total);

        }
        else {
            console.log("Tudo OK.");
        }
        }
        else {
            console.log("Erro. Velocidade precisa ser maior do que 0.");
            return 0;
        }
}