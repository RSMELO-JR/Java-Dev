import java.util.Scanner;

public class Ternaria {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
/*
Opcional ao If_Else, quando se desejar decidir um valor com base em uma condição.
Sintaxe:
   (condição) ? valor_se_verdadeiro : valor_se_falso

Exemplo:
   ( 2 > 4 ) ? 50 : 80 = Resultado é 80.
   ( 10 != 3) ? "Maria" : "Alex" = Resultado é "Maria.
 */

//DEMO:
    /*  double preco = 34.5;
      double desconto;
      if (preco < 20.0) {
         desconto = preco * 0.1;
      }
      else {
         desconto = preco * 0.05;
      }
      System.out.println(desconto);
      sc.close();
    */

// Simplificando:
     double preco = 34.5;
     double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
       System.out.println(desconto);
      sc.close();
   }
}
