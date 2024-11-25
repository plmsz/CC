class Patrono{
    constructor() {
        this.energia = 100
        this.protecao = 15
    }
    oferecerProtecao() {
        this.energia -= 10
        return this.protecao
    }
}

module.exports = Patrono  