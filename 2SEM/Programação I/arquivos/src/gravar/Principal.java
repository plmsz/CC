package gravar;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args)  throws FileNotFoundException, IOException{

		Scanner teclado = new Scanner(System.in);
		String matricula, nome;
		double teste, prova;
		int faltas;
		
		FileWriter arq;
			arq = new FileWriter("C:\\Users\\paloma.souza\\Downloads\\a.txt");
		
		PrintWriter gravarArq = new PrintWriter(arq);
		
		System.out.println("matricula");
		matricula = teclado.next();
		System.out.println("nome");
		nome = teclado.next();
		System.out.println("teste");
		teste = teclado.nextDouble();
		System.out.println("prova");
		prova = teclado.nextDouble();
		System.out.println("faltas");
		faltas = teclado.nextInt();
		
	
		
		gravarArq.println(matricula);
		gravarArq.println(nome);
		gravarArq.println(teste);
		gravarArq.println(prova);
		gravarArq.println(faltas);
		
		System.out.println("concluido");
		arq.close();
	}

}
