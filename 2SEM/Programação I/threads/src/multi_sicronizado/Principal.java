package multi_sicronizado;

public class Principal {

	public static void main(String[] args) {
		ListaNumeros listaNumeros = new ListaNumeros();
		
		ThreadExtendida1 minhathread1 = 
				new ThreadExtendida1(listaNumeros);
		ThreadExtendida2 minhathread2 = 
				new ThreadExtendida2(listaNumeros);
		
		minhathread1.start();
		minhathread2.start();

		/*
		 	11
			12
			13
			14
			101
			102
			103
			104
		  */
	}

}
