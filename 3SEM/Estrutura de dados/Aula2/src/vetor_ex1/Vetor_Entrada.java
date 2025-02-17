package vetor_ex1;

import java.util.Scanner;

public class Vetor_Entrada {

    public static void main(String[] args) {
        int[] vetSoma = new int[3];
        int soma = 0;

        System.out.println("Digite 3 valores");

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < vetSoma.length; i++) {
            vetSoma[i] = input.nextInt();
            soma = soma + vetSoma[i];
        }

        System.out.println(soma);
        input.close();
    }
}
