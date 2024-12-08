package set;

import java.util.HashSet;

public class Hash_set {

	public static void main(String[] args) {
		HashSet<String> numerosArrayList = new HashSet<>(); //poderia usar o Set como interface
		numerosArrayList.add("Oswaldo");
		numerosArrayList.add("Gisele");
		numerosArrayList.add("Giovanna");
		numerosArrayList.add("Giovanna");
		numerosArrayList.add("Juliana");
		
		for(String nome: numerosArrayList) {
			System.out.println(nome);
			/* Como hash calcula para que seja mais eficiente, vem em ordem aleatoria e não repete
			Giovanna
			Gisele
			Juliana
			Oswaldo
			 */
		}

	}

}
