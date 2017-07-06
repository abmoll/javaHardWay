import java.util.Scanner;
 
 public class DictionaryOrder {
     public static void main( String[] args ) {
         Scanner keyboard = new Scanner(System.in);
         String name;
 
         System.out.print( "Make up the name of a programming language! " );
         name = keyboard.nextLine();
 
         if ( name.toLowerCase().compareTo("c++") < 0 )
             System.out.println( name + " comes BEFORE c++" );
         if ( name.toLowerCase().compareTo("c++") == 0 )
             System.out.println( "c++ isn't a made-up language!" );
         if ( name.toLowerCase().compareTo("c++") > 0 )
             System.out.println( name + " comes AFTER  c++" );

     }
 }


