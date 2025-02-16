package classe_file;

import java.io.File;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("digite o caminho do arquivo");
		
		String nome = input.next();
		File objFile = new File(nome);
		
		if(objFile.exists()) {
			if(objFile.isFile()){
				System.out.println("nome "+ objFile.getName());
				System.out.println("lenght "+ objFile.length());
			}else {
				System.out.println("inexistente");				
			}
		}

	}

}
