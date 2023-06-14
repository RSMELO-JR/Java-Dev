import java.util.Scanner;

public class OperadoresCumulativos {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int minutos = sc.nextInt();
      double conta = 50.0;
      if (minutos > 100) {
         conta +=  (minutos - 100) * 2;
      //conta = conta + (minutos - 100) * 2;
      }
      System.out.printf("Valor da conta é = R$ %.2f %n", conta);
/*
Sintaxe Opcional dos Operadores Cumulativos:
   a += b(mais-igual) - é o mesmo que: a = a+b;
   a -= b(manos-iguel) - é o mesmo que: a = a-b;
   a *= b(mult-iguel) - é o mesmo que: a = a*b;
   a /= b(div-igual) - é o mesmo que: a = a/b;
   a %= b(mod-iguel) - é o mesmo que: a = a%b;
 */
      sc.close();
   }
}
