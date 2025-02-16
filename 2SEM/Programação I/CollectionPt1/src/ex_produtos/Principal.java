package ex_produtos;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Produto> setorA = new ArrayList<Produto>();
				setorA.add(new Produto(123, "blusa", 520));
				setorA.add(new Produto(234, "meia", 213));
				setorA.add(new Produto(345, "casaco", 101));
				setorA.add(new Produto(456, "boné", 59));
				setorA.add(new Produto(567, "camisa", 10));
				
				System.out.println("lista antes de orndenar");
				
				System.out.println("Qtd. " + "Item " + " Código ");
				
		for(Produto item: setorA) {
			System.out.println(item.quantidade + "  " + item.nome + "  " + item.codigo);
		}
		
		System.out.println("lista depois de orndenar");
		
		Collections.sort(setorA, new EstoqueComparator());
				
		for(Produto item: setorA) {
			System.out.println(item.quantidade + "  " + item.nome + "  " + item.codigo);
		}

	}

}
