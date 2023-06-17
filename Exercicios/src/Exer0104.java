/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
o valor que recebe por hora e calcula o salário desse funcionário.
A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
Entradas: 25, 100, 5.50; - Saídas: Number 25, Salary $550.00;
Entradas: 1, 200, 20.50 - Saídas:Number 1, Salary $4100.0;
Entradas: 6, 145, 15.55 - Saídas: Number 6, Salary $2254.75;
*/

import java.util.Scanner;
public class Exer0104 {
   public static void main(String[] args) {
      Scanner fc = new Scanner(System.in);

      double numero,horas, valorhora, salario;

      numero = fc.nextDouble();
      horas = fc.nextDouble();
      valorhora = fc.nextDouble();

      salario = valorhora * horas; //Obs: errei ao não digitar esta linha. ATENÇÃO. REVER!!!

      System.out.println("Number é: " + numero);
      System.out.printf("salario é: US$ %.2f%n", salario);

      fc.close();
   }
}