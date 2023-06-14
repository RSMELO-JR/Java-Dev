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

// Exemplo 02: double
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

// Exemplo 04: Casting - Conversão explicita dos valores
        int a2, b3;
        a2 = 5;
        b3 = 2;
        double resultado;
    //para que o programa retorne os todos os valores da operação, é preciso colocar a palavra "(double)" na frente da operação:
        resultado = (double) a2 / b3;
        System.out.println(resultado);

// Exemplo 05:
        double c;
        int d;

        c = 5.0;
        d = a;
        //erro que informa que vc não pode converter de 'double' para 'int';
        //para realizar esta operação é preciso usar o casting:
        d = (int) c;
        System.out.println(c);

    }
}
