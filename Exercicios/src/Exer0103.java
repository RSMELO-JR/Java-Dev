/*
Fazer um programa para ler quatro valores inteiros A, B, C e D.
A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula:
DIFERENCA = (A * B - C * D).
Entradas: 5,6,7,8 - Saída: Diferença -26;
Entradas: 5,6,.7,8 - Saída:Diferença 86;
*/

import java.util.Scanner;
public class Exer0103 {
   public static void main(String[] args) {
      Scanner  VL = new Scanner(System.in);
      int A, B, C, D, diferenca;

      A = VL.nextInt();
      B = VL.nextInt();
      C = VL.nextInt();
      D = VL.nextInt();
   //Obs: Errei ao usar o 'nextInt'. ATENÇÃO. REVER!!!

      diferenca = (A * B - C * D);

      System.out.println("A diferença é: "+ diferenca);

      VL.close();
   }
}