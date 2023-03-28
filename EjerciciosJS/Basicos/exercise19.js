let fechaNacimiento = prompt("Dame tu fecha de nacimiento (DD/MM/AAA):", "24/12/1996");

let partesFecha = fechaNacimiento.split("/");
let fechaNacimientoObj = new Date(partesFecha[2], partesFecha[1]-1, partesFecha[0]);

let fechaActual = new Date();

let edadUsuario = fechaActual.getFullYear() - fechaNacimientoObj.getFullYear();

if (fechaNacimientoObj.getMonth() > fechaActual.getMonth() || (fechaNacimientoObj.getMonth() == fechaActual.getMonth() && 
fechaNacimientoObj.getDate() > fechaActual.getDate())) {

	edadUsuario--;
}

document.write("Tienes " + edadUsuario  + " años.");