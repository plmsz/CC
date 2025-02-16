package exceçao;

public class CapturandoExceptions {
	public static void main(String[] args) {
	 try {
		 int res = 10/0;
		 System.out.println(res);		 
	 }catch(Exception e) {
		 System.out.println("causa " + e.getCause());
		 System.out.println("messagem " + e.getMessage());
		 System.out.println("nome " + e.getClass().getCanonicalName());
	 }
 }
}
