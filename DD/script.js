const listaDeBebidas = [
  {
    nome: "café",
    valor: 7.9,
  },
  {
    nome: "leite",
    valor: 5,
  },
  {
    nome: "chá",
    valor: 3.25,
  },
];
let bebida;
let finalizar = "nao";

function ExibirValor(bebida) {
  const bebidaEncontrada = listaDeBebidas.filter(
    (item) => item.nome === bebida
  );
  if (bebidaEncontrada) {
    alert(
      `O valor da bebida ${bebida} é R$ ${bebidaEncontrada[0].valor.toFixed(
        2
      )} reais.`
    );
  }
}
function EscolherBebida() {
  bebida = prompt("Escolha sua bebida: ");
  switch (bebida) {
    case "café":
    case "leite":
    case "chá":
      ExibirValor(bebida);
      break;
    default:
      alert("Você deve escolher entre café, leite e chá.");
      EscolherBebida();
      break;
  }
}

alert("Bem-vindo(a) ao sistema de bebidas. Temos: chá, café e leite.");

while (finalizar == "nao") {
  do {
    EscolherBebida();
  } while (bebida != "café" && bebida != "leite" && bebida != "chá");
  finalizar = prompt("Deseja finalizar o pedido?");
}

alert("Pedido Encerrado. Volte sempre!");
