class TrabalhandoComDados {
    public static void main(String entrada[]) {
        int numInt;
        double numReal, soma;
        char caractere;

        numInt = Integer.parseInt(entrada[0]);
        numReal = Double.parseDouble(entrada[1]);
        caractere = entrada[2].charAt(0);

        soma = (double)numInt+ numReal; //não é necessário, se soma foose do tipo inteiro numReal teria que ser convertido

        System.out.println((double)numInt + " " + numReal + " " + caractere + " " + soma + " sinal " + caractere);

        System.exit(0);
    }
}