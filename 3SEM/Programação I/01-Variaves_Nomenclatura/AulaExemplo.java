// - Diretrizes de programação

// - Nomenclatura

  //package descomplica.aula;

  public class AulaExemplo{
    public static final int MAIORIDADE_PENAL = 18; //não existe constante no java

    public static void main(String[] args){
      byte idade = 10; //comporta de -128 a 127
      short comprimento = 2000; //comporta de -32768 a 32767
      int i = 999; // comporta de -2147483648 a 2147483647
      long l = 10000000000L;  // comporta de -9223372036854775808 a 9223372036854775807
      float temperatura = 50.1F; // comporta de 1.4E-45 a 3.4028235E38
      double preco = 60.0; // comporta de 4.9E-324 a 1.7976931348623157E308

      char c = '7';
      boolean bo = true;
      System.out.println(idade);
    }
  }