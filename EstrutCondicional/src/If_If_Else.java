import java.util.Scanner;
public class If_If_Else {
   public static void main(String[] args) {

   //Exemplo 01: CONDICIONAL SIMPLES
      int x = 5;
      System.out.println("Bom dia");
      if (x < 0) {
         System.out.println("Boa tarde");
      }
      System.out.println("Boa noite");
      System.out.println();
//---------------------------------------------
   //Exemplo 02: CONDICIONAL COMPOSTA
      Scanner sc = new Scanner(System.in);
      int hora;
      System.out.println("Que horas são?");
      hora = sc.nextInt();

      if (hora < 12) {
         System.out.println("Bom dia");
      } else {
         System.out.println("Boa tarde");
      }
      sc.close();
   }
}

