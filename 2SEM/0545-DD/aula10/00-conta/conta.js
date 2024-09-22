class ContaCliente{
    constructor(numeroConta, saldo, debito, credito){
        this.numeroConta = numeroConta
        this.saldo = saldo
        this.debito = debito
        this.credito = credito
    }

    calcularSaldoAtual(){
        return this.saldo - this.debito + this.credito
    }

    verificarSaldo(){
        const saldoAtual = this.calcularSaldoAtual();
        if(saldoAtual >= 0){
            alert(`Seu saldo positivo é de R$ ${saldoAtual.toFixed(2)}`)
        }else{
            alert(`Seu saldo negativo é de R$ ${saldoAtual.toFixed(2)}`)}
    }
}

let numeroConta = prompt("digite o numero da sua conta");
let saldo = parseFloat(prompt("digite o seu saldo"));
let debito = parseFloat(prompt("digite o valor do debito"));
let credito = parseFloat(prompt("digite o valor do credito"));


const conta = new ContaCliente(numeroConta, saldo, debito, credito);

conta.verificarSaldo()