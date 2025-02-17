package matriz_entrada_3_swing;

import javax.swing.JOptionPane;

public class Matriz_Entrada {
    public static void main(String[] args) {
        int[][] matriz = new int[2][3];
        int soma = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro"));
                soma += matriz[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }

        System.out.println("Soma " + soma);
           
        System.exit(0);
    }
}
