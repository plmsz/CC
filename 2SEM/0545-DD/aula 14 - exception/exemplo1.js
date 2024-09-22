function processNome(nome, callback) {
  if (typeof nome !== 'string') {
    callback(new Error('O nome deve ser uma string'));
    return;
  }

  if (nome.length === 0) {
    callback(new Error('O nome não pode ser vazio'));
    return;
  }

  callback(null, 'Nome processado com sucesso');
}

processNome('', (error, result) => {
  if (error) {
    console.log("Ocorreu um erro:", error);
  } else {
    console.log(result);
  }
});

