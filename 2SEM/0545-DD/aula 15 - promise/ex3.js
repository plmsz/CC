class MinhaClasse {
  constructor(valor) {
    this.valor = valor;
  }
  operacaoAssincrona() {
    return new Promise((resolve, reject) => {
      const resultado = this.valor * 2;

      if (resultado >= 0) {
        resolve(resultado);
      } else {
        reject('o resultado é negativo');
      }
    });
  }
}

const minhaClasse = new MinhaClasse(1);

minhaClasse
  .operacaoAssincrona()
  .then((resultado) => {
    console.log('resultado:', resultado);
  })
  .catch((erro) => {
    console.log('erro: ', erro);
  });
