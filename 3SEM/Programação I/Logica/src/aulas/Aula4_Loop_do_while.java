package aulas;

import java.util.Scanner;

public class Aula4_Loop_do_while {

	public static void main(String[] args) {
		int num = 3;
		
		while(num <=5) {
			System.out.println(num);
			num++;
		}
		System.out.println("---");
		int num2 = 6; // imprime ao menos uma vez
		do {
			System.out.println(num2);
			num2++;
		}while(num2 <=5);
		
		Scanner teclado = new Scanner(System.in);
		int op;
		
		do{
			System.out.println("----");
			System.out.println("menu-");
			System.out.println("1 - aluno");
			System.out.println("2 - prof");
			System.out.println("3 - coord");
			System.out.println("0 - sair");
			System.out.println("escolha");
			
			op = teclado.nextInt();
			
			if(op==0) 
				break;
			
			switch(op) {
				case 1:{				
					System.out.println("você é aluno");
					break;
				}
				case 2:{				
					System.out.println("você é prof");
					break;
				}
				case 3:{				
					System.out.println("você é coor");
					break;
				}
				default: {
					System.out.println("inválido");	
				}
			}
			
		}while(true);
		
		System.out.println("fim");
	}
}
