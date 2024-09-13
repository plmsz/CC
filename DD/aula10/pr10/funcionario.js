class Funcionario {
    constructor(nome, idade, cargo){
        this.nome = nome
        this.idade = idade
        this.cargo = cargo
    }
    seApresentar(){
        console.log(`Meu nome é ${this.nome}, tenho ${this.idade} anos e trabalho como ${this.cargo}`)
    }
    trabalhar(){
        console.log(`${this.nome} está trabalhando.`)
    }
}

class Gerente extends Funcionario {
    constructor(nome, idade, cargo, departamento){
        super(nome, idade, cargo)
        this.departamento = departamento
    }
    gerenciar(){
        console.log(`${this.nome} está gerenciando.`)
    }
}

class Desenvolvedor extends Funcionario {
    constructor(nome, idade, cargo, linguagem){
        super(nome, idade, cargo)
        this.linguagem = linguagem
    }
    programar(){
        console.log(`${this.nome} esta programando em ${this.linguagem}.`)
    }
}

let gerente1 = new Gerente("Pedro Rocha", 30, "Gerente de TI", "TI")
gerente1.seApresentar()
gerente1.gerenciar()

let dev = new Desenvolvedor("Ana Souza", 25, "Desenvolvedora", "Javascript")
dev.seApresentar()
dev.trabalhar()
dev.programar()