package oop2;

import discentes.AlunoEnsinoSuperior;

public class Principal {

	public static void main(String[] args) {
		AlunoEnsinoSuperior aluno1 = new AlunoEnsinoSuperior();
		
		aluno1.setNome("Joe");
		aluno1.setTeste(10);
		aluno1.setProva(7);

		System.out.println(aluno1.getNome() + " " + aluno1.getMedia());
		
		//Modificador default (não escreve nenhum modificador) classe ficam visiveis quando estão no mesmo pacote
		// atriubutos e métodos são visiveis apenas dentro das classe que pertencem ao mesmo pacote
	}

}
