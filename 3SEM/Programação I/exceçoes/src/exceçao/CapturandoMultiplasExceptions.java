package exceçao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CapturandoMultiplasExceptions {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int lista[] = {10,20,30,40};
		int valor;
		int resultado;
		try {
			System.out.println("digite numero de 0 a 3");
			valor = scanner.nextInt();
			if(valor == 0) {
			resultado =  valor / lista[valor];
			}else {
			resultado =  lista[valor] / valor;
			}
			System.out.println(resultado);
			
			//Mais especifico => para mais genérica
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException " + e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception" + e.getMessage());
		}
	}
}
