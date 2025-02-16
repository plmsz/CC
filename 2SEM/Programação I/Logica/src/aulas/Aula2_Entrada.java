package aulas;

import java.util.Scanner;

public class Aula2_Entrada {
	public static void main(String[] args) {
	
		System.out.println("Digite dois valores");
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		int valor = input.nextInt();
		int valor2 = input.nextInt();
		
		System.out.println(valor/valor2);
		
	}

}
