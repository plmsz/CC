public class BubbleSort {

    public static int[] Bolha(int[] numeros) {
        int n = numeros.length;
        int aux;

        for (int i = 0; i <= n - 2; i++) { // *1
            for (int j = 0; j <= n - 2 - i; j++) { // *2
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }

        return numeros;
    }

    public static void main(String[] args) {
        int vet[] = { 26, 47, 38, 11, 95 };

        int[] numeroOrdenados = Bolha(vet);

        for (int i : numeroOrdenados) {
            System.out.print(i + " ");
        }

        System.exit(0);
        
    }

}

/*
 * 1 - controla o número de "passadas" pelo array. O loop vai de 0 até n-2
 * porque, após n-1 passadas, o array já estará ordenado.
 */

/*
 * 2 - Ele compara e troca elementos adjacentes dentro de cada passada. Perceba
 * que
 * o limite superior deste loop diminui a cada iteração do loop externo (n - 2 -
 * i). Isso acontece porque, a cada passada, o maior elemento já está na posição
 * correta no final do array, então não precisamos mais compará-lo.
 */