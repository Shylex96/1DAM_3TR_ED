// Generar matriz1 y matriz2 con 10 números aleatorios entre 1 y 10
let matriz1 = [];
let matriz2 = [];
for (let i = 0; i < 10; i++) {
  matriz1.push(Math.floor(Math.random() * 10) + 1);
  matriz2.push(Math.floor(Math.random() * 10) + 1);
}

// Sumar los valores de matriz1 y matriz2 en la matriz suma
let suma = [];
document.write("Contenido de la matriz suma:<br>");
for (let i = 0; i < 10; i++) {
	document.write("<br>")
	document.write(matriz1[i]+matriz2[i]);
}
