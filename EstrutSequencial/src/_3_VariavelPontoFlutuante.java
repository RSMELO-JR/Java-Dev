public class _3_VariavelPontoFlutuante {
    public static void main(String[] args) {

        //'double' recebe variáveis com casas decimais
        int y = 32;
        System.out.println(y);

        /*'printf' apresenta o resultado formatado a mascara realizada
        exemplo1: '%.3f' - formata em 2 casas decimais;
        exemplo2: '%.5f' - formata em 5 casas decimais;
        '%n' realiza uma quebra de linha no 'printf', independente da plataforma
        */
        double x = 10.34567;
        System.out.printf("%.3f%n", x);
        System.out.printf("%.5f%n", x);
    }
}
