import javax.swing.*;

public class aula03_ex02_alt {

    public static void main(String[] args) {
        int n1;
        char op;
        StringBuilder messageBuilder = new StringBuilder(); // Use StringBuilder for efficiency

        // Get input with error handling
        try {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número inteiro.");
            return; // Exit the program if invalid input
        }

        // Get operator choice with validation
        do {
            String operatorInput = JOptionPane.showInputDialog(null, "Escolha uma opção:\n1. para for\n2. para while\n3. para do/while");
            if (operatorInput.length() > 0 && operatorInput.charAt(0) >= '1' && operatorInput.charAt(0) <= '3') {
                op = operatorInput.charAt(0);
                break; // Exit the loop if valid input
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        } while (true);

        // Calculate the multiplication table based on the chosen operator
        switch (op) {
            case '1':
                for (int i = 1; i <= 10; i++) {
                    messageBuilder.append(n1).append(" x ").append(i).append(" = ").append(n1 * i).append("\n");
                }
                break;
            case '2':
                int i = 1;
                while (i <= 10) {
                    messageBuilder.append(n1).append(" x ").append(i).append(" = ").append(n1 * i).append("\n");
                    i++;
                }
                break;
            case '3':
                int j = 1;
                do {
                    messageBuilder.append(n1).append(" x ").append(j).append(" = ").append(n1 * j).append("\n");
                    j++;
                } while (j <= 10);
                break;
        }

        String message = messageBuilder.toString(); // Convert StringBuilder to String for display
        JOptionPane.showMessageDialog(null, message);
    }
}