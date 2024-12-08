package pr10;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeNumeros {
	public static void main(String[] args) {
		int soma = 0;
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Quantos números terá a lista?");
			int tamanho = input.nextInt();

			ArrayList<Integer> listaNumeros = new ArrayList<Integer>();

			System.out.println("Digite números inteiros");

			for (int i = 0; i < tamanho; i++) {
				int numero = (int) input.nextInt();
				listaNumeros.add(numero);
				soma += numero;
			}

			System.out.println("Lista:");

			for (int num : listaNumeros) {
				System.out.println(num);
			}

			System.out.println("Soma: " + soma);
		} catch (Exception e) {
			System.out.println("Insira números inteiros apenas.");
		} finally {
			input.close();
		}
	}
}
