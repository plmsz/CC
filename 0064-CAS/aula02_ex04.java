import javax.swing.*;
public class aula02_ex04 {
    
    public static void main (String entrada[])
{
int n1, n2;
double x;
n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
x = n1 / n2; // resultado será truncado 1 e 4 1/4=0.0
JOptionPane.showMessageDialog(null, x);
System.exit(0);
}

}
