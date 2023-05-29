public class concatenar1 {
    public static void main(String[] args) {
        /* Para CONCATENAR vários elementos em um mesmo comando de escrita, exemplo:
        (regra vale tanto para  'print' quanto 'println')
        "elemento1 + elemento2 + elemento3 + ... elementoN
         */
        double x = 10.34567;
        System.out.println("RESULTADO = " + x + " METROS");

        /* Para CONCATENAR vários elementos em um mesmo comando de escrita, exemplo:
        (regra vale tanto para 'printf')
        "texto1 %f texto2 %f texto3 %f ... variavel1, variavel2"
        '%f - ponto flutuante;
         */
        System.out.printf("RESULTADO = %.3f metros %n", x);

    }
}
