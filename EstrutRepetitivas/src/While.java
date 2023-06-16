import java.util.Scanner;
public class While {
   /*
   A estrutura WHILE é uma estrutura de controle que repete um bloco de comandos
	enquanto uma condição for verdadeira.
	*/
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int soma = 0;

      while (x != 0) {
         soma = soma + x;
         //usando o operado de atribuição cumulativa ficaria:
         // soma + =  x;
         x = sc.nextInt();
      }
      System.out.println(soma);
      sc.close();
   }
}
