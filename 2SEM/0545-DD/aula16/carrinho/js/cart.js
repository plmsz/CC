let carrinho = [];

function start() {
  fetch('https://fakestoreapi.com/products?limit=5')
    .then((response) => response.json())
    .then((data) => fillCart(data))
    .catch((error) => console.error(error));
}
function fillCart(products) {
  const containerCart = document.getElementById('container-cart');

  products.forEach((data) => {
    adicionarAoCarrinho(
      data.title,
      data.image,
      data.price,
      data.description,
      data.price
    );
  });

  atualizarCarrinho();
}

function adicionarAoCarrinho(nome, imgLink, preco, descricao, preco) {
  carrinho.push({
    nome: nome,
    imgLink: imgLink,
    preco: Number.parseFloat(preco),
    descricao: descricao,
    quantidade: 0,
    total: 0,
  });
}

function atualizarCarrinho() {
  let carrinhoHtml = document.getElementById('carrinho');

  carrinho.forEach((produto, index) => {
    carrinhoHtml.innerHTML += `<div id="produto${index}"
        class="d-flex flex-row justify-content-around align-items-center pt-lg-4 pt-2 pb-3 border-bottom mobile"
        >
        <div class="d-flex flex-column align-items-center w-25">
              <img src="${
                produto.imgLink
              }" width="150" height="150" alt="" id="image"/>
            <div class="pl-md-4 pl-1 text-break text-wrap">
                <h6>${produto.nome}</h6>
            </div>
        </div>      
        <div class="pl-md-4 pl-1 d-flex flex-column"><b>R$${produto.preco.toFixed(
          2
        )}</b></div>
        <div class="pl-md-0 pl-2">
            <span class="fa fa-minus-square text-secondary" onclick="removerItem(${index})"></span>
            <span id="quantidade${index}" class="px-md-3 px-1">${
      produto.quantidade
    }</span>
            <span
                class="fa fa-plus-square text-secondary" onclick="adicionarItem(${index})"></span>
        </div>
        <div class="pl-md-0 pl-1"><b> <span id="total${index}">R$ ${
      produto.total
    }</span></b></div>
        <div class="close" onclick="removeProduto(${index})">&times;</div>
    </div>`;
  });
}

function adicionarItem(item) {
  let qtd = document.getElementById('quantidade' + item);
  let produto = carrinho[item];

  produto.quantidade += 1;

  qtd.innerHTML = produto.quantidade;

  atualizarNumerosTela(qtd, item);
}

function removerItem(item) {
  let qtd = document.getElementById('quantidade' + item);
  let produto = carrinho[item];
  if (produto.quantidade > 0) {
    produto.quantidade -= 1;
    qtd.innerHTML = produto.quantidade;
  }
  atualizarNumerosTela(qtd, item);
}

function atualizarNumerosTela(qtd, item) {
  atualizaTotalProduto(item);
  atualizaSubtotal();
}

function atualizaTotalProduto(item) {
  let total = document.getElementById('total' + item);
  let produto = carrinho[item];
  carrinho[item].total = Number.parseFloat(produto.quantidade * produto.preco);
  total.innerHTML = produto.total.toFixed(2);
}

function atualizaSubtotal() {
  let totalCompra = document.getElementById('subtotal');
  let subtotal = 0;

  carrinho.forEach((produto) => {
    subtotal += produto.quantidade * produto.preco;
  });
  totalCompra.innerHTML = subtotal.toFixed(2);
}

function removeProduto(item) {
  let carrinhoHtml = document.getElementById('carrinho');
  let produto = document.getElementById('produto' + item);

  if (confirm('Deseja remover o produto do carrinho?')) {
    carrinho[item].quantidade = 0;
    atualizaSubtotal();
    carrinhoHtml.removeChild(produto);
  }
}

start();
