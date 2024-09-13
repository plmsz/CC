class DispositivoEletronico {
    constructor(nome) {
        this.nome = nome
        this.ligado = false
    }

    ligar() {
        if (this.ligado) {
            console.log(this.nome + ' ja esta ligado')
            return
        }
        this.ligado = true
    }
}

class Smartphone extends DispositivoEletronico {
    constructor(nome, cor, modelo) {
        super(nome)
        this.cor = cor
        this.modelo = modelo
    }
}

var s1 = new Smartphone("s1", "branco", "Samsung")
console.log(s1)

s1.ligar()
console.log(s1)