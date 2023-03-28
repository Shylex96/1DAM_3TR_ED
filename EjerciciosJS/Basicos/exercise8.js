// Generar 5 números aleatorios entre 1 y 50
let numeros = [];
for (let i = 0; i < 5; i++) {
  numeros.push(Math.floor(Math.random() * 50) + 1);
}

// Mostrar los 5 números generados
document.write("Los 5 números generados son: " + numeros);

// Encontrar el número mayor
let mayorNumero = numeros[0];
for (let i = 1; i < numeros.length; i++) {

    if (numeros[i] > mayorNumero) {
    mayorNumero = numeros[i];
    }
}

document.write("<br>El mayor número generado es: " + mayorNumero);