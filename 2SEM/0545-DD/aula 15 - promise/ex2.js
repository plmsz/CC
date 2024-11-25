function somarArray(array){
    return new Promise((reoslve, reject) =>{
        if(!Array.isArray(array)){
            reject("argumento passado não é array")
        }

        const soma = array.reduce((total, num) => total + num, 0);

        reoslve(soma)
    })
}

const myArray = [1,2,3]

somarArray(myArray)
    .then((resultado)=>{
        console.log("soma dos resultados:", resultado);
    })
    .catch((erro)=>{
        console.log("ocorreu um erro:", erro);
        
    })