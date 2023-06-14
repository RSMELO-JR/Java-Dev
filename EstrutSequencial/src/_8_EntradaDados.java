import java.util.Scanner;

public class _8_EntradaDados {
    public static void main(String[] args) {
/*
Entrada/Leitura de Dados é qdo o 'usr' informa dados para o programa usando dispositivos de entrada,
como teclado.
No JAVA, para entrada de dados é criado um objeto do tipo "Scanner" antes da declaração da variável,
iniciando da seguinte forma: < Scanner + nm_var = new Scanner(System.in); >.
 */
        //Exemplo 01: escrevendo uma String
        Scanner sc = new Scanner(System.in);
        String x;
        x = sc.next();
        System.out.println("Você digitou a palavra: " + x);

        //Exemplo 02: escrevendo um número inteiro
        int a;
        a = sc.nextInt();
        System.out.println("Você digitou o número: " + a);

        //Exemplo 03: escrevendo um número flutuante
        double y;
        y = sc.nextDouble();
        System.out.println("Você digitou: " + y);

        //Exemplo 04: escrevendo um caractere
        char w;
        w = sc.next() .charAt(0); //Obs: o número entre parênteses determina o caracter à ser lido, no caso "R"
        System.out.println("Você digitou: " + w);
        char w1;
        w1 = sc.next() .charAt(3); //Obs: o número entre parênteses determina o caracter à ser lido, no caso "a":
        System.out.println("Você digitou: " + w1);

        //Exemplo 05: escrevendo vários dados na mesma linha
        String b;
        int c;
        double d;
        b = sc.next();
        c = sc.nextInt();
        d = sc.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        sc.close();
    }
}
