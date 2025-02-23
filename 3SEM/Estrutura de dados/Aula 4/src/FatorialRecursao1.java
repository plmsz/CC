public class FatorialRecursao1 {
    public static int fat(int n) {
        if (n == 0) {
            // retorna para ultima chamada - na pilha
            return 1; // regra 1 -  saber quando parar
        } else {
            // fica salvo em um pilha
            return n * fat(n - 1); // regra 2 e 3 - decidir como fazer a proxima ação e chamada menor
        }
    }

    public static void main(String[] args) {
        int result = fat(2); 
        System.out.println(result);
    }
}
