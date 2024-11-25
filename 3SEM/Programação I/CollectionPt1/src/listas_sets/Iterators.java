package listas_sets;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {

	public static void main(String[] args) {
		ArrayList<String> listaNome = new ArrayList<>();
		listaNome.add("Oswaldo");
		listaNome.add("Gisele");
		listaNome.add("Giovanna");
		listaNome.add("Juliana");
		
		/*for(String nome: listaNome) {
			System.out.println(nome);
		}*/
		
		Iterator<String> iterator = listaNome.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());			
		}


	}

}
