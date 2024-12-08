package delegando_exc;

public class Principal {

	public static void main(String[] args) {
		try {
			Filha classeFilha = new Filha();
			classeFilha.executar();
		} catch (Exception e) {
			System.out.println("erro na classe principal" + e.getMessage());
		}

	}

}
