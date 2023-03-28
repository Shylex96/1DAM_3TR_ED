let cuadrado1 = document.getElementById("cuadrado1");
let cuadrado2 = document.getElementById("cuadrado2");
let cuadrado3 = document.getElementById("cuadrado3");
let cuadrado4 = document.getElementById("cuadrado4");
let cuadrado5 = document.getElementById("cuadrado5");

// Seleccionar el elemento body
let body = document.querySelector('body');

// Agregar event listeners a los cuadrados
cuadrado1.addEventListener("mouseover", function() { cambiarColorFondo("red") });
cuadrado1.addEventListener("mouseout", function() { cambiarColorFondo("white") });

cuadrado2.addEventListener("mouseover", function() { cambiarColorFondo("blue") });
cuadrado2.addEventListener("mouseout", function() { cambiarColorFondo("white") });

cuadrado3.addEventListener("mouseover", function() { cambiarColorFondo("green") });
cuadrado3.addEventListener("mouseout", function() { cambiarColorFondo("white") });

cuadrado4.addEventListener("mouseover", function() { cambiarColorFondo("yellow") });
cuadrado4.addEventListener("mouseout", function() { cambiarColorFondo("white") });

cuadrado5.addEventListener("mouseover", function() { cambiarColorFondo("orange") });
cuadrado5.addEventListener("mouseout", function() { cambiarColorFondo("white") });

// Función para cambiar el color de fondo
function cambiarColorFondo(color) {
    body.style.backgroundColor = color;
}