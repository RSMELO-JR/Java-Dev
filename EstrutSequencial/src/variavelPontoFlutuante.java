public class variavelPontoFlutuante {
    public static void main(String[] args) {

        int y = 32;
        double x = 10.34567;
        //'double' recebe variáveis com casas decimais

        System.out.println(y);
        System.out.printf("%.3f%n", x);
        System.out.printf("%.5f%n", x);

        /*'printf' apresenta o resultado formatado a mascara realizada
        exemplo1: '%.3f' - formata em 2 casas decimais;
        exemplo2: '%.5f' - formata em 5 casas decimais;
        '%n' realiza uma quebra de linha no 'printf', independente da plataforma
        */

    }
}
