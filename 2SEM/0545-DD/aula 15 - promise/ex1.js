const minhaPromise = new Promise((resolve, reject) =>{
    const sucesso = false;

    if(sucesso){
        resolve('DEU BOM');
    }else{
        reject('DEU RUIM');
    }
})

minhaPromise
    .then((resultado) =>{
        console.log('Sucesso', resultado);
    })
    .catch((erro) =>{
        console.log('Erro', erro);
    })