import javax.swing.JOptionPane;

public class aula04_ex02 {
    public static void soma() {
        int[] nums = new int[5];
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
            soma += nums[i];
       } 
    JOptionPane.showMessageDialog(null, "Soma: " + nums[0] + " + " + nums[1] + " + " + nums[2] + " + " + nums[3] + " + " + nums[4] + " = " + soma);    
    }
    public static int produtoria() {
        int[] nums = new int[5];
        int potencia = 1;
        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
            potencia *= nums[i];
        }
        return potencia;
    }
public static void main(String[] args) {
    soma();
    JOptionPane.showMessageDialog(null, "Produtoria: " + produtoria());
}
}
