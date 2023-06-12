public class _6_Concatenar2 {
    public static void main(String[] args) {
        /* Para CONCATENAR vários elementos em um mesmo comando de escrita, exemplo:
        (regra vale tanto para 'printf')
        "texto1 %f texto2 %f texto3 %f ... variável1, variável2"
        %f - ponto flutuante;
        %d - Inteiro;
        %s - texto
        %n - quebra de linha
        */
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.printf("%s tem %d anos e ganha R$ %.2f %n", nome, idade, renda);
    }
}
