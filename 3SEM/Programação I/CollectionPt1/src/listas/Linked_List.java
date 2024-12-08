package listas;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		LinkedList<String> minhaLL = new LinkedList<String>();
		//List<String> minhaLL = new LinkedList<String>(); List é interface, estamos implemento de forma polimorfica
		
		minhaLL.addFirst("a");
		minhaLL.add("b");
		minhaLL.add("c");
		minhaLL.add("d");
		minhaLL.add(4, "e");
		minhaLL.add("f");
		minhaLL.addLast("g");
		minhaLL.addLast("g");
		minhaLL.remove();
		minhaLL.removeLast();
		
		System.out.println(minhaLL.getFirst());
		System.out.println(minhaLL.peekLast());
		System.out.println("---");
		System.out.println(minhaLL); //[b, c, d, e, f, g]
		
		
		
		

	}

}
