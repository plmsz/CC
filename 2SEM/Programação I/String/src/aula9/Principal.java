package aula9;

public class Principal {

	public static void main(String[] args) {
		String nome = "silva";
		String apelido = "silva";
		String sobrenome = new String("silva");

		// Strings são imutáveis
		/*if (nome == apelido) { // iguais, pois ele não compara o contéudo, compara o endereço
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}

		if (nome == sobrenome) { // diferentes, pois é um novo endereço
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}*/
		if (nome.equals(apelido)) { // iguais,
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}

		if (nome.equals(sobrenome)) { // iguais, pois equals compara o conteudo
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
		
		String nome1 = "Silva costa";
		System.out.println(nome1.toLowerCase());
		System.out.println(nome1.charAt(2)); //l
		System.out.println(nome1.indexOf("c")); //6
		System.out.println(nome1.isEmpty()); // false
		System.out.println(nome1.contains("b")); //false
		System.out.println(nome1.equalsIgnoreCase("SILVA COSTA")); //true
		
		String x = "0123456789"; // o valor de cada caractere é igual ao seu índice!

		System.out.println (x.substring (5)); // saída é “56789”

		System.out.println (x.substring (5, 8)); // saída é “567”
		
		//Concatenar strings, pois cada vez que você concatena ele cria um novo, e joga fora o antigo, ocupando 
		//muita memória
		
		//StringBuffer está tendo todos os métodos sincronizados, 
		
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(nome);
		buffer.append(" e ");
		buffer.append(sobrenome);
		String nomeBuffer = buffer.toString();
		System.out.println(nomeBuffer);
		
		//StringBuilder não é seguro para threads, mas tem melhor desempenho
		StringBuilder builder = new StringBuilder();
		builder.append(nome);
		builder.append("de");
		builder.append(sobrenome);
		String nomeBuilder = builder.toString();
		System.out.println(nomeBuilder);
		
		
	}
}
