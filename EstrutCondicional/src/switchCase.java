import java.util.Scanner;
public class switchCase {
   public static void main(String[] args) {
   //Exemnplo 01: If_Else_Encadeado
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      String dia;
      if (x == 1) {
         dia = "Dom";
      }
      else if (x == 2) {
         dia = "Seg";
      }
      else if (x == 3) {
         dia = "Ter";
      }
      else if (x == 4) {
         dia = "Qua";
      }
      else if (x == 5) {
         dia = "Qui";
      }
      else if (x == 6) {
         dia = "Sex";
      }
      else if (x == 7) {
         dia = "Sáb";
      }
      else {
         dia = "valor inválido";
      }
      System.out.println("Dia da Semana : " + dia);
      sc.close();
   //----------------------
      switch (x) {
         case 1:
            dia = "domingo";
            break;
         case 2:
            dia = "segunda";
            break;
         case 3:
            dia = "terça";
            break;
         case 4:
            dia = "quarta";
            break;
         case 5:
            dia = "quinta";
            break;
         case 6:
            dia = "sexta";
            break;
         case 7:
            dia = "sabado";
         default:
            dia = "valor inválido";
            break;
      }
      System.out.println("Dia da Semana:  " + dia);
      sc.close();
   }
}
