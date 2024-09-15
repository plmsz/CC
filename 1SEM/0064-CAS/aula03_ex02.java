import javax.swing.*;

public class aula03_ex02 {

    public static void main(String[] args) {
        int n1;
        char op;
        String message = "";

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        op =JOptionPane.showInputDialog(null, "Escolha uma opção 1 para para calcular tabuada por for,2-para while ou 3 para do/while:").charAt(0);

        switch (op) {
            case '1':
            for (int i = 1; i <= 10; i++) {
                message += n1 + " x " + i + " = " + n1 * i + "\n";
            }
            break;
            case '2':
            int i = 1;
            while (i <= 10) {
                message += n1 + " x " + i + " = " + n1 * i + "\n";
                i++;
            }
            break;
            case '3':
            int j = 1;
            do{
                message += n1 + " x " + j + " = " + n1 * j + "\n";
                j++;
            }while(j <= 10);
            break;
            default:
            JOptionPane.showMessageDialog(null, "Opção inválida");
                break;
        }

        JOptionPane.showMessageDialog(null, message);
    }
}