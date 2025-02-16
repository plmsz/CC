package extends_threads;

public class MinhaThreadExtendida extends Thread {
	public void run() {
		System.out.println("Thread Secundária"); // entra para fila, aparece depois
	}
	
	public static void main(String[] args) {
		MinhaThreadExtendida minhaThread = new MinhaThreadExtendida();
		
		minhaThread.start();
		System.out.println("Thread Principal"); //ocorre primeiro
	}
}
