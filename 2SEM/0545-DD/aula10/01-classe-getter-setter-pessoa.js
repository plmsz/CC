class Pessoa {
  constructor(nome, sobrenome) {
    this.nome = nome;
    this.sobrenome = sobrenome;
  }

  falar() {
    console.log('Olá ' + this.nome + ' ' + this.sobrenome);
  }
  get nomeCompleto() { //encapsulamento
    return 'Olá ' + this.nome + ' ' + this.sobrenome;
  }

  set nomeCompleto(novoNome) {
    const nomes = novoNome.split(' ');
    this.nome = nomes[0].charAt(0).toUpperCase() + nomes[0].slice(1);
    this.sobrenome = nomes[1].charAt(0).toUpperCase() + nomes[1].slice(1);
  }
}

pessoa1 = new Pessoa('João', 'Silva')
pessoa1.falar()
console.log(pessoa1.nomeCompleto);

pessoa2 = new Pessoa();
pessoa2.nomeCompleto = 'maria silva';
pessoa2.falar()