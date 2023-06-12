public class _7_ProcesDados {
    public static void main(String[] args) {
/* O processamento de dados é feito através do comando de atribuição:
Sintaxe: <variável> = <expressão> ou seja, lê-se: <variável recebe expressão;>
Exemplo 01:
 */
        int x, y;
        x = 5;
        y = 2 * x;
        System.out.println(x);
        System.out.println(y);
        System.out.println();

// Exemplo 02:
        int a;
        double b;
        a = 5;
        b = 2 * a;
        System.out.println(a);
        System.out.println(b);

// Exemplo 03: Trapézio
        double b2, B, h, area;
        b2 = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b2 + B) / 2.0 * h;
        System.out.println(area);

    }
}
