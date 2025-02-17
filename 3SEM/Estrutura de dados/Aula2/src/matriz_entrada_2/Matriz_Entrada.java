package matriz_entrada_2;

import java.util.Scanner;

public class Matriz_Entrada {
    public static void main(String[] args) {
        int[][] matriz = new int[2][3];
        int soma = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite números da matriz");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = input.nextInt();
                soma += matriz[i][j];
            }
        }
        input.close();

        System.out.println("Matriz");

        for (int i = 0; i < 2; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }

        System.out.println("Soma " + soma);
    }
}
