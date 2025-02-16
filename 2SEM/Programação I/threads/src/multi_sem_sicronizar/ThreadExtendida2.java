package multi_sem_sicronizar;

public class ThreadExtendida2 extends Thread {
	ListaNumeros listaNumeros;
	
	public ThreadExtendida2(ListaNumeros listaNumeros) {
		this.listaNumeros = listaNumeros;
	}

	public void run() {
		listaNumeros.printTable(100);
	}
}
