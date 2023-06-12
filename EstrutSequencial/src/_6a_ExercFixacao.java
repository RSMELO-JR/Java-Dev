import java.util.Locale;

public class _6a_ExercFixacao {
    public static void main(String[] args) {
// inicie em um novo programa, as seguintes variáveis:
// %f = ponto flutuante; %d = inteiro; %s = texto; %n = quebra linha

        String product1 = "Computer";
        String product2 = "Office Desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

/*  Em seguida, produza a seguinte saida de dados na tela:
    Products:
    Computer, wich price is $2100,00
    Office Desk, wich price is $650,50
    Record: 30 years old, code 5290 and gender F
    Measure with eight decimal places: 53.23456700
    Rouded (three decimal places) 53,234
    Us decimal point: 53.234
 */
        System.out.println("Products: ");
        System.out.printf("%s, wich price is U$ %.2f %n", product1, price1);
        System.out.printf("%s, wich price is U$ %.2f %n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender %c %n", age, code, gender);
        System.out.printf("Measue with eight decimal places: %.8f %n", measure);
        System.out.printf("Rouded (three decimal places) %.3f %n", measure);

    }
}
