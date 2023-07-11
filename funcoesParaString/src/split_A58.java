public class split_A58 {
   public static void main(String[] args) {
   /*
   O Split é uma função que serve para recortar a String,
   conforme o separador informado,
   alocando esses recortes em um vetor[].
   É importante atentar para o 'SEPARADOR' da String.
    */

   /*
   String s = "potato apple lemon";
   String[] vect = s.split(" ");
   String w0 = vect[0];
   String w1 = vect[1];
   String w2 = vect[2];
   System.out.println( vect[2]);
   */

   // definindo um separador diferente para a fx Split
      String b = "potato-apple-lemon-orange";
      String[] a1 = b.split("-");
      System.out.println(a1[1]);

   }
}
