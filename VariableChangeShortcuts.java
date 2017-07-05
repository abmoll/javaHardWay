public class VariableChangeShortcuts {
     public static void main( String[] args ) {
         int i, j, k;
 
         i = 5;
         j = 5;
         k = 5;
         System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
         i =  i + 3;
         j =  j - 3;
         k =  k * 3;
         System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" );
 
         i = 5;
         j = 5;
         k = 5;
         System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
         i += 3;
         j -= 3;
         k *= 3;
         System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" );
 
         i = j = k = 5;
         System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
         i += 1;
         j -= 2;
         k *= 3;

         System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
         i += 1;
         j -= 2;
         k *= 3;
         System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" );
 
         i = j = 5;
         System.out.println( "i: " + i + "\tj: " + j );
         i =+ 1; // Oops!
         j =- 2;
         System.out.println( "i: " + i + "\tj: " + j + "\n" );
 
         i = j = 5;
         System.out.println( "i: " + i + "\tj: " + j );
         i++;
         j--;
         System.out.println( "i: " + i + "\tj: " + j );
         i = 5;
         i -= 5;
         System.out.println(i);
         i = 5;
         i++;
         i++;
         i++;
         i++;
         i++;
         System.out.println(i);
         
     }
}
