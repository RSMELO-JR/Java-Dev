import java.util.Scanner;
/*
Faça um programa para ler o valor do raio de um círculo e depois,
mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
Fórmula da área: area = π . raio2; Considere o valor de π = 3.14159.
Entrada 2.00; Saida A=12.5664;
Entrada 100.64; Saida A=31819.3103;
Entrada 150.00; Saida A=70685.7750;
 */
public class Exer0102 {
   public static void main(String[] args) {
      Scanner PY = new Scanner(System.in);
      double R, A, pi=3.14159;
      R = PY.nextDouble();
      A = pi * R * R;
      System.out.printf("A=%.4f%n", A);

      PY.close();
   }
}
