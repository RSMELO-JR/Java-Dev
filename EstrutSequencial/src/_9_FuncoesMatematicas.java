public class _9_FuncoesMatematicas {
   public static void main(String[] args) {
/* ALGUMAS FUNÇÕES MATEMÁTICAS EM JAVA, Exemplos:
   A = Math.sqrt(x); - <RAIZ_QUADRADA> significa que: variável 'A' recebe a raiz quadrada de 'x';
   A = Math.pow(x, y); - <POTENCIAÇÃO> significa que: a variável 'A recebe o resultado de 'x' elevado a 'y';
   A = Math.abs(x); - <VALOR_ABSOLUTO> significa que: a variável 'A' recebe o valor absoluto de 'x' (valores NÃO NEGATIVOS);
*/
      double x = 3.0;
      double y = 4.0;
      double z = -5.0;
      double A, B, C;

   //Exemplo 01 - RAIZ QUADRADA
      A = Math.sqrt(x);
      B = Math.sqrt(y);
      C = Math.sqrt(25.0);
      System.out.println("Raiz Quadrada de " + x + " = " + A);
      System.out.println("Raiz Quadrada de " + y + " = " + B);
      System.out.println("Raiz Quadrada de 25 = " + C);
      System.out.println();

   //Exemplo 02: POTENCIAÇÃO:
      A = Math.pow(x, y);
      B = Math.pow(x, 2.0);
      C = Math.pow(5.0, 2.0);
      System.out.println(x + " elevado a " + y + " = " + A);
      System.out.println(x + " elevado ao quadrado =  " + B);
      System.out.println("5 elevado ao quadrado = " + C);
      System.out.println();

   //Exemplo 03: VALOR ABSOLUTO
      A = Math.abs(y);
      B = Math.abs(z);
      System.out.println("Valor absoluto de  " + y + " = " + A);
      System.out.println("Valor absoluto de  " + z + " = " + B);
      System.out.println();

   }
}
