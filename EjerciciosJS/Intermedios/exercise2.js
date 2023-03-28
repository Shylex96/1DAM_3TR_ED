function mostrarConversion() {
    let euros = document.getElementById("nombre").value;
    let bitcoins = document.getElementById("nombre").value;

    // 1€ = 0,000040 BTC
    // 1 BTC = 25011,45€

    function eurosAbitcoins() {
        if (euros != "") {
            let resultado;
            resultado = euros * 0.000040;
            resultado = resultado.toFixed(2);

            // escribir en el input el resultado
        }
    }

    function bitcoinsAeuros() {
        if (bitcoins != "") {
            let resultado;
            resultado = bitcoins * 25011.45;
            resultado = resultado.toFixed(2);

            // escribir en el input el resultado
        }
    }
}

function limpiarConversion() {
    let campoEuros = document.getElementById("euros").value = "";
    let campoBitcoins = document.getElementById("bitcoins").value = "";

    campoEuros;
    campoBitcoins;
}
