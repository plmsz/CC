package runnable;

public class Principal {
	public static void main(String[] args) {
		MinhaThread minhaThread = new MinhaThread();
		Thread thread = new Thread(minhaThread);
		
		thread.start();
		
	}
}
