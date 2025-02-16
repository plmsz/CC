package set;

import java.util.Set;
import java.util.TreeSet;

public class Tree_set {

	public static void main(String[] args) {
		TreeSet<String> listaNome = new TreeSet<>(); //poderia usar o TreeSet como interface
		listaNome.add("Oswaldo");
		listaNome.add("Gisele");
		listaNome.add("Giovanna");
		listaNome.add("Giovanna");
		listaNome.add("Juliana");
		listaNome.add("Cassandra");
		
		for(String nome: listaNome) {
			System.out.println(nome);
			/*  É ordenado de forma crescente, mais é lento que o hashset e também não repete
			    Cassandra
				Giovanna
				Gisele
				Juliana
				Oswaldo
			 */
		}
		System.out.println("---");
		TreeSet<String> newListaSet = (TreeSet<String>) listaNome.subSet("Giovanna", "Oswaldo");
		System.out.println(newListaSet); //[Giovanna, Gisele, Juliana]

	}

}
