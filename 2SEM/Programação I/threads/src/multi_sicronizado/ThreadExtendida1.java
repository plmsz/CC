package multi_sicronizado;

public class ThreadExtendida1 extends Thread {
	ListaNumeros listaNumeros;
	
	public ThreadExtendida1(ListaNumeros listaNumeros) {
		this.listaNumeros = listaNumeros;
	}

	public void run() {
		listaNumeros.printTable(10);
	}
}
