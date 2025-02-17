public class App {
    public static void main(String[] args) {
        int[] numeros = { 26, 47, 38, 11, 95 };
        int n = numeros.length;
        int aux;

        for (int i = 0; i <= n - 2; i++) {
            for (int j = 0; j <= n - 2 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }

        for (int i : numeros) {
            System.out.print(i + " ");
        }
    }
}
