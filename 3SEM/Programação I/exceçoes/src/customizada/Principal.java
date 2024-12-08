package customizada;

public class Principal {

	public static void main(String[] args) {
		try {
		throw new ExcecaoCustomizada("minha excecao");	
		
		}catch(ExcecaoCustomizada e) {
			System.out.println(e.toString());
		}

	}

}
