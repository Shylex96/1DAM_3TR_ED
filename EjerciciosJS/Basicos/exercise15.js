const fechaActual = new Date();

const diaSemanaEN = fechaActual.toLocaleDateString('en-US', { weekday: 'short' });
const diaMesEN = fechaActual.toLocaleDateString('en-US', { day: 'numeric' });
const mesEN = fechaActual.toLocaleDateString('en-US', { month: 'short' });
const añoEN = fechaActual.toLocaleDateString('en-US', { year: 'numeric' });
const horaEN = fechaActual.toLocaleTimeString('en-US', {hour: '2-digit', minute:'2-digit'});
const zonaHorariaEN = fechaActual.toTimeString().split(' ')[1];
const texto1EN = "Fecha actual:";
const texto2EN = "(hora estándar de Europa central)";

const fechaFormateada = `${diaSemanaEN} ${mesEN} ${diaMesEN} ${añoEN} ${horaEN} ${zonaHorariaEN} ${texto2EN}`;
const fechaCompleta = `Fecha actual: ${fechaFormateada}<br>`;

document.write(fechaCompleta);

const diaSemana = fechaActual.toLocaleDateString('es-ES', { weekday: 'long' });
const diaMes = fechaActual.toLocaleDateString('es-ES', { day: 'numeric' });
const mes = fechaActual.toLocaleDateString('es-ES', { month: 'long' });
const año = fechaActual.toLocaleDateString('es-ES', { year: 'numeric' });
const hora = fechaActual.toLocaleTimeString('es-ES', {hour: '2-digit', minute:'2-digit'});

document.write(`Día de la semana: ${diaSemana}<br>`);
document.write(`Día del mes: ${diaMes}<br>`);
document.write(`Mes: ${mes}<br>`);
document.write(`Año: ${año}<br>`);