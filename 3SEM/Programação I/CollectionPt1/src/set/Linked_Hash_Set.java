package set;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Linked_Hash_Set {
	public static void main(String[] args) {
		ArrayList<Integer> numerosArrayList = new ArrayList<>(); 
		numerosArrayList.add(1);
		numerosArrayList.add(3);
		numerosArrayList.add(2);
		numerosArrayList.add(1);
		
		System.out.println(numerosArrayList); //[1, 2, 3, 1] ordem de inserção
		
		LinkedHashSet<Integer> numerosLHS = new LinkedHashSet<>(numerosArrayList);	//[1, 2, 3]
		
		System.out.println(numerosLHS);
	}

}
