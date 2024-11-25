import javax.swing.JOptionPane;

public class aula04_ex02 {
    public static void soma() {
        int[] numbers = new int[5];
        int vetor[3];
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
            soma += numbers[i];
       } 
    JOptionPane.showMessageDialog(null, "Soma: " + numbers[0] + " + " + numbers[1] + " + " + numbers[2] + " + " + numbers[3] + " + " + numbers[4] + " = " + soma);    
    }
    public static int produtoria() {
        int[] numbers = new int[5];
        int potencia = 1;
        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
            potencia *= numbers[i];
        }
        return potencia;
    }
public static void main(String[] args) {
    soma();
    JOptionPane.showMessageDialog(null, "Produtoria: " + produtoria());
}
}
