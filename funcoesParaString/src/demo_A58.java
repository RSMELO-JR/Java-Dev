public class demo_A58 {
   public static void main(String[] args) {

      //Funções mais utilizadas para String:
      String original = "abcde FGHIJ ABC abc DEFG  ";
      String s01 = original.toLowerCase();
      // transforma toda a String para minusculo //
      System.out.println("original:- " + original + "-");
      System.out.println("toLowerCase: -" + s01 + "-");

      String s02 = original.toUpperCase();
      // transforma a String para maiúscola //
      System.out.println("toLowerCase: -" + s02 + "-");

      String s03 = original.trim();
      // manter a String original, mas remove espaços nos cantos da String//
      System.out.println("trim -" + s03 + "-");

      String s04 = original.substring(2);
      // criará uma NOVA String a partir do caracter 2 em diante //
      System.out.println("substring(2) -" + s04 + "-");

      String s05 = original.substring(2, 9);
      // criará uma NOVA String a partir da posição 2 até a posição 9 //
      System.out.println("substring(2,9) -" + s05 + "-");

      String s06 = original.replace('a','x');
      // substituirá o caracter informado //
      System.out.println("replace('a', 'x') -" + s06 + "-");
      String s07 = original.replace("abc", "xy");
      System.out.println("replace('abc', 'xy') -" + s07 + "-");

      int i = original.indexOf("bc");
      // informa qual a primeira ocorrência de determinada String //
      System.out.println("Index of: 'bc': " + i);

      int j = original.lastIndexOf("bc");
      // informa qual a últimaa ocorrência de determinada String //
      System.out.println("Last index of: 'bc': " + j);

   }
}
