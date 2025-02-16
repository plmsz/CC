package maps;

import java.util.TreeMap;
import java.util.Map;

public class Tree_Map {
//ordem crescente
	public static void main(String[] args) {
	Map<String, String> listaNome = new TreeMap<String, String>();
	
	listaNome.put("wawa","Oswaldo");
	listaNome.put("gi", "Gisele");
	listaNome.put("lu", "Luisa");
	listaNome.put("vic", "Victoria");
	listaNome.put("juju","Juliana");
	
	System.out.println(listaNome.containsValue("Juliana"));

	System.out.println(listaNome);
}
}