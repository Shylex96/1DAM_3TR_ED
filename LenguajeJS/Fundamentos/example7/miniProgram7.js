let confirmacion = confirm("¿Quiéres entrar al sitio web?");

if (confirmacion == true) { // Es necesario mantener dos iguales o detectará ambas opciones como true.
    alert("Vamos a jugar :)"); // true si se pulsa OK
    jugar();
} else {
    alert("¿No vamos a jugar? :(");
    noJugar();
}


function jugar() {

let resultado = 0;

let pregunta1 = prompt("¿Cuánto es 9 x 7?"); // 63
let pregunta2 = prompt("¿Cuánto es 57/3?"); //19
let pregunta3 = prompt("¿Cuánto es 26 + 5 x 2 ?"); // 36
let pregunta4 = prompt("¿Cuánto es ((3 x 5 + 4) * 0) + 2 / 1?"); // 2
let pregunta5 = prompt("¿Cuánto es √144"); // 12

if (pregunta1 == 63) {
    resultado = 1;
} else {
    resultado = 0;
}

if (pregunta2 == 19) {
    resultado++;
} 

if (pregunta3 == 36) {
    resultado++;
} 

if (pregunta4 == 2) {
    resultado++;
} 

if (pregunta5 == 12) {
    resultado++;
} 

alert("Juego terminado. ¡Resultado: " +resultado+ " de 5!");
if (resultado == 0) {
    alert("¡Vaya!, creo que necesitas repasar matemáticas.");
} else if (resultado == 1) {
    alert("¡Vaya!, al menos acertaste alguna. Deberías repasar matemáticas.");
} else if (resultado == 2) {
    alert("¡Casi!, Estás a punto de aprobar, prueba de nuevo.");
} else if (resultado == 3) {
    alert("¡Bien!, has aprobado el test.");
} else if (resultado == 4) {
    alert("¡Wouh!, una nota casi perfecta, bien hecho.");
} else if (resultado == 5) {
    alert("¡Increíble!, las matemáticas no son un problema para ti.");
}
}


function noJugar() {
    alert("Bueno, otra vez será. ¡Adiós!");
}