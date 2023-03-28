let titulo = document.getElementById("titulo");

let clics = 0;
let tiempoEspera = 300; // tiempo en milisegundos para determinar si fue clic simple o doble clic
let timer = null;

titulo.addEventListener("click", function() {
    clics++;
    if (clics === 1) {
    timer = setTimeout(function() {
    alert("Se hizo click simple en el encabezado");
    clics = 0;
    }, tiempoEspera);
    } else if (clics === 2) {
    clearTimeout(timer);
    alert("Se hizo doble click en el encabezado");
    clics = 0;
    }
});