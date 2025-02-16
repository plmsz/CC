package leitura;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		String nomeDoArquivo = "C:\\\\Users\\\\paloma.souza\\\\Downloads\\\\a.txt";
		
		System.out.println("contéudo");
		
		FileReader arq;
		try {
			arq = new FileReader(nomeDoArquivo);
			
			BufferedReader lerArq = new BufferedReader(arq);
			
			String linha = lerArq.readLine();
			while(linha != null) {
				System.out.println(linha);	
				linha = lerArq.readLine();
			}

			arq.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
