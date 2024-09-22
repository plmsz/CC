const valorProduto= [50.00,30.00]
let valorTotal = [0,0]
let qtd = [0,0]


function adicionarItem(item){
    let quantidade = document.getElementById("quantidade"+item)
    let total = document.getElementById("total"+item)
    
    qtd[item] += 1
    valorTotal[item] = parseFloat(valorProduto[item])*qtd[item]

    quantidade.innerHTML = qtd[item]
    total.innerHTML = valorTotal[item].toFixed(2)
    
    atualizarTotal()
}

function removerItem(item){
    if(qtd[item] <= 0) return
    let quantidade = document.getElementById('quantidade' + item);
    let total = document.getElementById('total' + item);
    
    qtd[item] -= 1
    valorTotal[item] = parseFloat(valorProduto[item])*qtd[item]
    
    quantidade.innerHTML = qtd[item]
    total.innerHTML = valorTotal[item].toFixed(2)
    
    atualizarTotal()
}

function atualizarTotal(){
    let subtotal = document.getElementById("subtotal")
    subtotal.innerHTML = (valorTotal[0]+valorTotal[1]).toFixed(2)
}

