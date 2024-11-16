package oop;

public class Professor extends Pessoa {
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	double getInss() {
		return salario * 0.11;
	}
	
	double getSalarioLiquido() {
		return salario - this.getInss();
	}
}
