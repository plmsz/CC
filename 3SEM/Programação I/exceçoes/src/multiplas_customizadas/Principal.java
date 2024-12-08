package multiplas_customizadas;

public class Principal {

	public static void main(String[] args) {
		try {
			int array[] = new int[3];
			array[0] = 10/1;
			System.out.println(array[0]);
		} catch (ArithmeticExceptionCustomizada e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsExceptionCustomizada e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
