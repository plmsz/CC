package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Comparators {

	public static void main(String[] args) {
		ArrayList<String> listaNomes = new ArrayList<>();
		listaNomes.add("Oswaldo");
		listaNomes.add("Gisele");
		listaNomes.add("Giovanna");
		listaNomes.add("Giullia");
		listaNomes.add("Juliana");
		
		System.out.println("antes de ordenar");
		
		for(int i = 0; i < listaNomes.size(); i++) {
			System.out.println(listaNomes.get(i));
		}
		
		Comparator<String> comparator = Collections.reverseOrder();
		
		Collections.sort(listaNomes, comparator);
		
		System.out.println("depois de ordenar");
		
		Iterator<String> iterator = listaNomes.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());			
		}
		
	}

}
