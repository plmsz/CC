package maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linked_HashMap {

	public static void main(String[] args) {
		//uma lista que mantem ordem de entrada dos elementos
		Map<String, String> listaNome = new LinkedHashMap<String, String>();
		
		listaNome.put("wawa","Oswaldo");
		listaNome.put("gi", "Gisele");
		listaNome.put("gio", "Giovanna");
		listaNome.put("gigi", "Giovanna");
		listaNome.put("juju","Juliana");
		
		System.out.println(listaNome.containsKey("gio"));

		System.out.println(listaNome);

	}

}
