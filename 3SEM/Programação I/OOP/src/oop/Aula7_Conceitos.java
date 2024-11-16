package oop;

public class Aula7_Conceitos {

	public static void main(String[] args) {
		Student aluno = new Student();
		aluno.nome = "Joe";
		aluno.prova = 10;
		aluno.teste = 7.5;
		
		System.out.println("teste " + aluno.nome + " " + aluno.obterMedia());
		
		//Aluno a1 = new Aluno(); //não pode instanciar pois a classe é abstrato
		
		Professor prof = new Professor();
		prof.setNome("Jack");
		prof.setSalario(10000);
		System.out.println("prof "+ prof.getNome() + " " + prof.getSalarioLiquido());
		
		AlunoEnsinoMedio student = new AlunoEnsinoMedio();
		student.setNome("Jane");
		student.setProva(10);
		student.setTeste(8);
		System.out.println("aluno em " + student.getNome() + " " + student.getMedia());
		
		AlunoEnsinoSuperior student2 = new AlunoEnsinoSuperior();
		student2.setNome("Joane");
		student2.setProva(10);
		student2.setTeste(8);
		System.out.println("aluno es "+ student2.getNome() + " " + student2.getMedia());
		
	}

}
