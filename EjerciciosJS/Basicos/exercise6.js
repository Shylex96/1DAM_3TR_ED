aleatorioParImpar();


function aleatorioParImpar() {
    
        let setRandom = Math.floor(Math.random() * 10 + 1);

        if ((setRandom % 2) === 0) {
            document.write("El número obtenido es el " + setRandom + " y es PAR"); 
        } else {
            document.write("El número obtenido es el " + setRandom + " y es IMPAR"); 
        }
    
}

