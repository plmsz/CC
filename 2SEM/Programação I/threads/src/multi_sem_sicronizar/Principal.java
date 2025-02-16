package multi_sem_sicronizar;

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
			101
			102
			12
			103
			104
			13
			14
		  */
	}

}
