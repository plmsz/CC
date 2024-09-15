import javax.swing.JOptionPane;

public class aula03_ex03 {
    public static void main(String[] args) {
        String numbers;
        double n1, n2;
        numbers = JOptionPane.showInputDialog("Digite dois números ");
        n1 = Double.parseDouble(numbers.split(" ")[0]);
        n2 = Double.parseDouble(numbers.split(" ")[1]);
        if (n1 % 2 == 0 && n2 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Soma dos números: " + n1 + " + " + n2 + " = " + (n1 + n2));
        }else if( n1 % 2 != 0 && n2 % 2 != 0 ){
            JOptionPane.showMessageDialog(null, "Somatório de n1: " + n1 + " * " + n2 + " = " + (n1 * n2));
        }else{
            JOptionPane.showMessageDialog(null, "Potencia de n1 a n2: " + n1 + " ^ " + n2 + " = " + (Math.pow(n1, n2)));
        }
    }

}
