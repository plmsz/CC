package leitura;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Binario {

	public static void main(String[] args) {
		String nomeDoArquivo = "C:\\\\Users\\\\paloma.souza\\\\Downloads\\\\a.dat";
		String matricula, nome;
		double teste, prova;
		int faltas;
		
		System.out.println("contéudo");
		
		FileInputStream arq;
		try {
			arq = new FileInputStream(nomeDoArquivo);
			
			DataInputStream lerArq = new DataInputStream(arq);
			
			matricula = lerArq.readUTF();
			nome = lerArq.readUTF();
			teste = lerArq.readDouble();
			prova = lerArq.readDouble();
			faltas = lerArq.readInt();
			arq.close();
			
			double media = (teste +prova)/2;
			System.out.println(media + " faltas: " + faltas);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
