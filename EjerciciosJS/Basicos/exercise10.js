// Generar 5 números aleatorios entre 1 y 50
let numeros = [];
for (let i = 0; i < 5; i++) {
  numeros.push(Math.floor(Math.random() * 10) + 1);
}

// Mostrar los 5 números generados de uno en uno
document.write("Los 5 números generados son: <br><br>");
for (let i = 0; i < numeros.length; i++) {
    document.write(numeros[i] + "<br>");
}

// Encontrar el número mayor
let mayorNumero = numeros[0];
for (let i = 1; i < numeros.length; i++) {

    if (numeros[i] > mayorNumero) {
    mayorNumero = numeros[i];
    }
}

// Mostrar el número mayor
document.write("<br>El mayor número es: " + mayorNumero);