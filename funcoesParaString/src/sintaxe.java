import java.util.Scanner;
public class sintaxe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //criando uma variável 'higher' para acumular o 'max'de a, b, c
        // 'max' é a função criada que recebe 3 numeros inteiros para retornar o maior deles
        int higher = max(a, b,c);
        // criando uma função para exibir a mensagem na tela
        showResult(higher);

        sc.close();
    }
    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        }
        else if (y > z) {
            aux = y;
        }
        else {
            aux = z;
        }
        return aux;
    }
    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }

}
