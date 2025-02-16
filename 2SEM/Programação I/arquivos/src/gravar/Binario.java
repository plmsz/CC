package gravar;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Binario {

	public static void main(String[] args)  throws FileNotFoundException, IOException{

		Scanner teclado = new Scanner(System.in);
		String matricula, nome;
		double teste, prova;
		int faltas;
		
		FileOutputStream arq;
			arq = new FileOutputStream("C:\\Users\\paloma.souza\\Downloads\\a.dat");
		
			DataOutputStream gravarArq = new DataOutputStream(arq);
		
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
		
		gravarArq.writeUTF(matricula);
		gravarArq.writeUTF(nome);
		gravarArq.writeDouble(teste);
		gravarArq.writeDouble(prova);
		gravarArq.writeInt(faltas);
		
		arq.close();
		System.out.println("concluido");
	}

}
