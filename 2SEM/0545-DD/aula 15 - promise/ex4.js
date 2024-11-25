function obterValor(valor) {
  return new Promise((resolve, reject) => {
    if (valor > 10) {
      valor += 1;
      resolve(valor);
    } else {
      reject('não foi possível obter o valor');
    }
  });
}

function dobrarValor(valor) {
  return valor * 2;
}
function adicionar10(valor) {
  return valor + 10;
}

obterValor(28)
  .then((valor) => {
    console.log('valor obtido', valor);
    return dobrarValor(valor);
  })
  .then((novoValor) => {
    console.log('segundo tratamento', novoValor);
    return adicionar10(novoValor);
  })
  .then((res) => {
    console.log(`resultado final ${res}`);
  })
  .catch((erro) => {
    console.log('ocorreu um erro', erro);
  });
