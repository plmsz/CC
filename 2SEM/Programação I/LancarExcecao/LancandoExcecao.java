import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int op;
		do {
			op = scanner.nextInt();
			System.out.println("1 ou 2?");
			try {
			op = scanner.nextInt();
			switch(op) {
			case 1:{
				System.out.println("porta 1");
			}
			case 2:{
				System.out.println("porta 2");
			}
			default:
				throw new Excecao("Erro";)
			}
			} catch (Excecao excecao) {
				System.out.println(excecao.getMessage());
			}finally {
				System.out.println("---------");
				scanner.close();
			}
		}while(true);
	}
}
