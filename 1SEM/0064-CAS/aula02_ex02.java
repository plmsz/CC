public class aula02_ex02 {
    
    public static void main(String[] args) {
        int num1, num2, resto, quociente;
        double raizQuadrada, potencia;
        String texto = "";

        num1 = Integer.parseInt(args[0]); 
        num2 = Integer.parseInt(args[1]);
        resto = num1 % num2;
        quociente = num1 / num2; //resultado será truncado
        raizQuadrada = Math.sqrt(num1);
        potencia = Math.pow(num1, num2); 
        
        // texto = String.format("%d %d %f %f %f %f", num1, num2, resto, quociente, raizQuadrada, potencia);
        texto = "n1 = " + num1 + " n2 = " + num2 + "\n";
        texto += "resto = " + resto + "\n";
        texto += "quociente = " + quociente + "\n";
        texto += "raiz quadrada = " + raizQuadrada + "\n";
        texto += "potencia = " + potencia + "\n";
        
        System.out.println(texto);

    }

}
