function checaPositivos(numeros){
    if (!Array.isArray(numeros)) {
      throw new Error('O argumento deve ser um array');
    }

    const todosPositivos = numeros.every(numero => numero > 0);

    if(!todosPositivos){
        throw new Error("O array deve conter apenas valores positivos");
    }

    return todosPositivos;
}

try {
    const numeros = [1, 2, 3, 4, 5];
    const ePositivo = checaPositivos(numeros);
    console.log(ePositivo ? "Todos os valores sao positivos" : "Nem todos os valores sao positivos");
} catch (error) {
    console.log("Ocorreu um erro: " + error.message);
} 


