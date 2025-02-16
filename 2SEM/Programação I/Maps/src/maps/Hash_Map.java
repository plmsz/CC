package maps;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
		HashMap<Integer, String> linguagens = new HashMap<>();
		linguagens.put(1, "java");
		linguagens.put(2, "js");
		linguagens.put(3, "ts");
		linguagens.put(40, "c#");
		
		System.out.println("contéudo " + linguagens); //contéudo {1=java, 2=js, 3=ts, 40=c#}
		System.out.println(linguagens.get(40)); //c#
		
		System.out.println("chaves " + linguagens.keySet()); //chaves [1, 2, 3, 40]
		System.out.println("valores " + linguagens.values()); // [java, js, ts, c#]
		System.out.println("par " + linguagens.entrySet()); //par [1=java, 2=js, 3=ts, 40=c#]
		
		//HashTable é semelhante mas ele é safe-thread

	}

}
