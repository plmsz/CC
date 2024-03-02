import javax.swing.JOptionPane;

public class aula04_ex01 {
    public static int s, dif;
    public static void soma(int n1, int n2){
        s = n1 + n2;
    }
    public static void diferenca(int n1, int n2){
        dif = n1 - n2;
    }
    public static int produto(int n1, int n2){
        return n1 * n2;
    }
    public static double divisao(int n1, int n2){
        return (double)n1 / n2;
    }
    


    public static void main(String[] args) {
        int n1, n2;
        double d, p;

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro valor"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo valor"));

        soma(n1, n2);
        diferenca(n1, n2);
        p = produto(n1, n2);
        d = divisao(n1, n2);
        
        JOptionPane.showMessageDialog(null, "Soma: " + s + "\nDiferenca: " + dif + "\nProduto: " + p + "\nDivisão: " + d); 
    }
}
