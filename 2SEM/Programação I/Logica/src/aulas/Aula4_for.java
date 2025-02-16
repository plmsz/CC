package aulas;

import java.util.Scanner;

public class Aula4_for {

	public static void main(String[] args) {
		int alunos;
		double nota, soma, media;
	
		soma = 0;
		
		System.out.println("alunos?");
		Scanner input = new Scanner(System.in);
		
		alunos = input.nextInt();
		
		for(int i=1;i<=alunos;i++) {
			System.out.println("n" + i);
			nota = input.nextDouble();
			soma +=nota;
		}
		
		media = (soma/alunos);
		System.out.println("media " + media);

	}

}
