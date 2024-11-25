const Patrono = require("./04-composicao-patrono.js")

class Mago {
    constructor(patrono) {
        this.ataque = 10
        this.defesa = 5
        this.energia = 100
        this.patrono = patrono
    }

    atacar() {
        this.energia -= 10
        return this.ataque 
    }

    defender() {
        this.energia -= 10
        return this.defesa
    }

    pedirProtecaoDoPatrono() {
        this.energia += this.patrono.oferecerProtecao()
    }
}

let cervo = new Patrono()
let merlin = new Mago(cervo)

merlin.atacar()
merlin.pedirProtecaoDoPatrono()

console.log(merlin)
console.log(cervo)