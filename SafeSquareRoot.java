import java.util.Scanner;
 
 public class SafeSquareRoot {
     public static void main( String[] args ) {
         Scanner keyboard = new Scanner(System.in);
         double x, y;
         String z;
         
         System.out.println("Are you ready?");
         z = keyboard.next();
         while (! z.equals("YES!")) {
         	System.out.println("I won't continue until you type \"YES!\" ");
         	z = keyboard.next();
         }
 
         System.out.print("Give me a number, and I'll find it's square root. ");
         System.out.print("(No negatives, please.) ");
         x = keyboard.nextDouble();
         while ( x < 0 ) {
             System.out.println("I won't take the square root of a negative.");
             System.out.print("\nNew number: ");
             x = keyboard.nextDouble();
         }
 
         y = Math.sqrt(x);
 
         System.out.println("The square root of "+x+" is "+y);
     }
 }
