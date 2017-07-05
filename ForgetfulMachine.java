import java.util.Scanner;

 public class ForgetfulMachine {
     public static void main( String[] args ) {
         Scanner keyboard = new Scanner(System.in);
 
         System.out.println( "What city is the capital of France?" );
         keyboard.next();
 
         System.out.println( "What is 6 multiplied by 7?" );
        keyboard.nextInt();
        /* the 2nd question blows up when I type 5.2 */
 
         System.out.println( "Enter a number between 0.0 and 1.0." );
        keyboard.nextDouble();
        // the third question blows up when I type "dd"  
        // This is because the system expected a double but got a string.
 
         System.out.println( "Is there anything else you would like to say?" );
         keyboard.next();
     }
 }