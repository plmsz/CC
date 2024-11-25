import javax.swing.*;

public class aula03_ex01 {

    public static void main(String[] args) {
        char op;
        int n1;

        op = JOptionPane.showInputDialog("Escolha uma opção 1 para par ou impar ou 2 para positivo ou negativo:").charAt(0);

            switch (op) {
                case '1':
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
                if(n1 % 2 == 0){
                    JOptionPane.showMessageDialog(null, "O número "+n1+" é par");
                }else{
                    JOptionPane.showMessageDialog(null, "O número "+n1+" é impar");
                }
                break;
                case '2':
                n1 = Integer.parseInt(JOptionPane.showInputDialog( "Digite um número: \n"));
                if (n1 >= 0) {
                    JOptionPane.showMessageDialog(null, "O número "+n1+" é positivo");
                }else{
                    JOptionPane.showMessageDialog(null, "O número "+n1+" é negativo");
                }
                break;
                default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
            break;
        }

    }
}