package ex_produtos;

import java.util.Comparator;

public class EstoqueComparator implements Comparator<Produto> {

	public int compare(Produto p1, Produto p2) {
		if(p1.quantidade == p2.quantidade) {
			return 0;			
		}else if(p1.quantidade > p2.quantidade) {
			return 1;
		}else {
			return -1;
		}
	}
}
