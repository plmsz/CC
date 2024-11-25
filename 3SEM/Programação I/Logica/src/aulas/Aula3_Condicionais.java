package aulas;

import java.util.Scanner;

public class Aula3_Condicionais {
	
	public static final byte maiorIdade = 18;
	public static final byte melhorIdade = 60;

	public static void main(String[] args) {
		byte idade = 21;
		if(idade < maiorIdade) {			
			System.out.println("criança"); //false
		}else 
			if(idade >= melhorIdade) {
				System.out.println("velho");
			}
			else {
				System.out.println("adulto");
			}
		
			/*
			 * Scanner input = new Scanner(System.in); Scanner input2 = new
			 * Scanner(System.in); Scanner input3 = new Scanner(System.in); double nota1 =
			 * input.nextDouble(); double nota2 = input2.nextDouble(); double nota3 =
			 * input3.nextDouble();
			 * 
			 * double media = (nota1 + nota2 + nota3)/3;
			 * 
			 * if(media >= 7) { System.out.println("aprovado " + media); }else {
			 * System.out.println("reprovado " + media); }
			 */
		int num = 2;
		
		// se não adiciona break, ele imprime 2 e 3
		switch(num) {
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
		}
		System.out.println("---------");
		//imprime apenas 2
		switch(num) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
		case 5:
			System.out.println("4 ou 5");
		default:
			System.out.println("outro");
			break;
		}
		
		float n1 = 100f;
		float n2 = 200f;
		float n3 = 300f;
		
		if( n1 < n2 &&  n1 < n3) {
			System.out.println("menor n1");
		}
		if( n3 > n2 || n3 > n1) {
			System.out.println("n3 não é menor");	
		}
	 System.out.println(n1 > n2 ? "maior" : "menor");
		
	int o = 23; // binário é 10111;
	int z = ~ o; //inverte bit 
	System.out.println(z);

	}

}
