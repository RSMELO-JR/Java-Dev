/*
Fazer um programa para ler o código de uma peça 1, a quantidade de peças 1, o valor unitário de cada peça 1,
o código de uma peça 2, a quantidade de peças 2 e o valor unitário de cada peça 2.
Calcule e mostre o valor a ser pago.
Entradas: 12,1,5.30- 16,2,5,10 - Saida: Valor a pagar: R$15.50;
Entradas: 13,2,15.30-161,4,5.20 - Saída: Valor a pagar: R$51.40;
Entradas: 1,1,15.10-2,1,15.10 - Saída: Valor a pagar: R$30.20;
 */
import java.util.Scanner;
public class Exer0105 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int cod1, cod2, qtd1, qtd2;
      double p1, p2, tt;

      cod1 = sc.nextInt();
      qtd1 = sc.nextInt();
      p1 = sc.nextDouble();

      cod2 = sc.nextInt();
      qtd2 = sc.nextInt();
      p2 = sc.nextDouble();

      tt = p1 * qtd1 + p2 * qtd2;

      System.out.printf("Valor a pagar: R$ %.2f%n", tt);

      sc.close();
   }
}
