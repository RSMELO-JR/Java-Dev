import java.util.Scanner;

public class _8_EntradaDados2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      //Exemplo 06: escrevendo um texto para ler vários dados inseridos, até a quebra de linha
      String e1, e2, e3;
      e1 = sc.nextLine();
      e2 = sc.nextLine();
      e3 = sc.nextLine();
      System.out.println("Dados digitados: ");
      System.out.println(e1);
      System.out.println(e2);
      System.out.println(e3);

      //*** Exemplo 07***: *ATENÇÃO*: quebra de linha pendente, ao ler um dado tipo 'int/double':
      int x;
      String d1,d2,d3;
      x = sc.nextInt();
      /*
      qdo digitamos uma variável do tipo e apertamos o enter, cria uma quebra de linha que fica pendente na entrada
      padrão. Dai, qdo 'chamanos' a próxima linha, o comando 'nextLine' consome a quebra de linha pendente,
      deixando a próxima varável com uma 'String' vazia.
      Para resolver, é preciso criar uma linha com um comando 'sc.nextLine();' vazia para consumir essa quebra de linha.
       */
      sc.nextLine();
      d1 = sc.nextLine();
      d2 = sc.nextLine();
      d3 = sc.nextLine();

      System.out.println("Dados digitados: ");
      System.out.println(x);
      System.out.println(d1);
      System.out.println(d2);
      System.out.println(d3);

      sc.close();
   }
}
