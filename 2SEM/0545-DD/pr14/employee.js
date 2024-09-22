export class Employee {
  constructor(name, age, role) {
    this.name = name;
    this.age = age;
    this.role = role;
  }
  introduceYourself() {
    const firstName = this.name.split(' ')[0];
    if(this.role === 'Outro'){
      return `Meu nome é ${firstName}, tenho ${this.age} anos.`;
    }
    return `Meu nome é ${firstName}, tenho ${this.age} anos e trabalho como ${this.role}.`;
  }
  work() {
    return `${this.name} está trabalhando em suas tarefas.`;
  }
}

export class Manager extends Employee {
  constructor(name, age, role, department) {
    super(name, age, role);
    this.department = department;
  }
  management() {
    return `Liderança de Equipes. Planejamento Estratégico. Gerenciamento de Projetos de ${this.department}.`;
  }
}

export class Developer extends Employee {
  constructor(name, age, role, language) {
    super(name, age, role);
    this.language = language;
  }
  programming() {
    return `Escrever códigos em ${this.language}. Revisar de código. Escrever testes unitários.`;
  }
}
