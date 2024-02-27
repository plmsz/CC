import javax.swing.*;
public class aula02_ex03 {
    
    public static void main(String[] args) {
        int num1, num2, quociente;
        double potencia;
        String texto = "";

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: ")); 
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        quociente = num1 / num2; 
        potencia = Math.pow(num1, num2); 
    
        texto = "n1 = " + num1 + " n2 = " + num2 + "\n";
        texto += "quociente = " + quociente + "\n";
        texto += "potencia = " + potencia + "\n";
        
        JOptionPane.showMessageDialog(null, texto);
    
        System.exit(0);
    }

}
