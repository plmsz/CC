fetch('https://jsonplaceholder.typicode.com/users?_start=2&_limit=10')
  .then((response) => response.json())
  .then((data) => {
    fillList(data);
  });

function fillList(data) {
  const containerList = document.getElementById('container-list');
  const ul = document.createElement('ul');
  containerList.appendChild(ul);

  data.forEach((user) => {
    const li = document.createElement('li');
    li.textContent = user.name;
    ul.appendChild(li);
  });
}

fetch('https://fakestoreapi.com/products?limit=5')
  .then((response) => response.json())
  .then((data) => fillCart(data))
  .catch((error) => console.error(error));

function fillCart(data) {
  const containerCart = document.getElementById('container-cart');

  data.forEach((product) => {
    const divProduto = document.createElement('div');
    divProduto.classList.add('cart-product');
    containerCart.appendChild(divProduto);

    const imagem = document.createElement('img');
    imagem.src = product.image;
    imagem.alt = product.title;
    imagem.width = 100;
    imagem.height = 100;

    const h3 = document.createElement('h3');
    h3.textContent = product.title;
    divProduto.appendChild(imagem);
    divProduto.appendChild(h3);

    const price = document.createElement('p');
    price.textContent = `R$ ${product.price.toFixed(2)}`;
    divProduto.appendChild(price);
  });
}
