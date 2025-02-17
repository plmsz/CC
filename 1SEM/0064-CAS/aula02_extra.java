import javax.swing.*;
public class aula02_extra {
    
    public static void main(String[] args) {
        // Cria frame da janela
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);

        // Cria painel para agrupar elementos
        JPanel panel = new JPanel();
        frame.add(panel);

        // Cria labels para os números
        JLabel labelNum1 = new JLabel("Primeiro número:");
        JLabel labelNum2 = new JLabel("Segundo número:");
        panel.add(labelNum1);
        panel.add(labelNum2);

        // Cria campos de texto para entrada de dados
        JTextField textFieldNum1 = new JTextField(10);
        JTextField textFieldNum2 = new JTextField(10);
        panel.add(textFieldNum1);
        panel.add(textFieldNum2);

        // Cria botão para efetuar cálculo
        JButton buttonCalcular = new JButton("Calcular");
        buttonCalcular.addActionListener(e -> {
            try {
                // Obtém valores dos campos de texto
                int num1 = Integer.parseInt(textFieldNum1.getText());
                int num2 = Integer.parseInt(textFieldNum2.getText());

                // Calcula quociente e potência
                double quociente = (double) num1 / num2;
                double potencia = Math.pow(num1, num2);

                // Exibe resultado em caixa de diálogo
                JOptionPane.showMessageDialog(null, 
                        String.format("Quociente: %.2f\nPotência: %.2f", quociente, potencia));
            } catch (NumberFormatException ex) {
                // Exibe mensagem de erro caso a entrada não seja válida
                JOptionPane.showMessageDialog(null,  "Entrada inválida. Digite apenas números inteiros.");
            }
        });
        panel.add(buttonCalcular);

        // Exibe janela
        frame.setVisible(true);
    }
}
