let numero = prompt("Ingrese un número:");

document.write("<h3>Tabla de multiplicar del " + numero + "</h3>");

for (let i = 1; i <= 10; i++) {
  document.write(numero + " x " + i + " = " + (numero * i) + "<br>");
}
