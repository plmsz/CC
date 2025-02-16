package listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Iterators_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> listaNome = new ArrayList<>();
		listaNome.add("Oswaldo");
		listaNome.add("Gisele");
		listaNome.add("Giovanna");
		listaNome.add("Juliana");
		
		/*for(String nome: listaNome) {
			System.out.println(nome);
		}*/
		
		System.out.println("antes");
				
		Iterator<String> iterator = listaNome.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());		
		}
		
		listaNome.set(0, "Cassandra");
		listaNome.remove(3);
		
		System.out.println("\ndepois");
		
		Iterator<String> iterator2 = listaNome.iterator();
		
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		Vector<String> listaNome2 = new Vector<>();
		listaNome2.add("Carol");
		listaNome2.add("Lais");
		
		System.out.println("\nVector - igual ao ArrayList porém safe-thread");
		for(String nome: listaNome2) {
			System.out.println(nome);
		}
	}
}
