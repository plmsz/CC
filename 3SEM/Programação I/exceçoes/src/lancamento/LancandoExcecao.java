package lancamento;

import java.util.Scanner;

public class LancandoExcecao {
	public static void main(String[] args) throws Exception {
		int op;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("digite 1 ou 2:");
			System.out.println();
			try {
				op = scanner.nextInt();
				switch (op) {
				case 1: {
					System.out.println("porta 1");
					break;
				}
				case 2: {
					System.out.println("porta 2");
					break;
				}
				default:
					throw new Excecao("escolheu errado");
				}
			} catch (Exception excecao) {
				System.out.println(excecao.getMessage());
			} finally {
				System.out.println("---------");
			}
		} while (true);
	}
}
