/*
Exemplo:
Fazer um programa para ler a temperatura em Celsius e mostrar o equivalente em Fahrenheit.
Pergunte se o usuário deseja repetir - S / N. Caso resposta for "s", repetir o programa.
Formúla:   " F = 9 * C / 5 + 32 "
 */
import java.util.Scanner;
public class do_While {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      char resp;
      do {
         System.out.print("Digite a temperatura em Celsius: ");
         double C = sc.nextDouble();
         double F = 9.0 * C / 5.0 + 32.0;

         System.out.printf("Equivalente en Fahrenheit: %.2f%n", F);
         System.out.print("Deseja Repetir:(s/n) ");
         resp = sc.next().charAt(0);
      } while (resp != 'n');

      sc.close();
   }
}
