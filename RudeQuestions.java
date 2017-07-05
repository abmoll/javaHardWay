import java.util.Scanner;
 
 public class RudeQuestions {
     public static void main( String[] args ) {
         String name;
         int age;
         double weight, income;
 
         Scanner keyboard = new Scanner(System.in);
 
         System.out.print( "Hello. What is your name? " );
         name = keyboard.next();
         // does not blow up
 
         System.out.print( "Hi, " + name + "! How old are you? " );
         age = keyboard.nextInt();
         // this blows up when you enter a letter or double
 
         System.out.println( "So you're " + age + ", eh? That's not very old." );

         System.out.print( "How much do you weigh, " + name + "? " );
         weight = keyboard.nextDouble();
         // this blows up when enter a letter
 
         System.out.println( weight + "! Better keep that quiet!!" );
         System.out.print("Finally, what's your income, " + name + "? " );
         income = keyboard.nextDouble();
         // blows up when you enter a letter
 
         System.out.print( "Hopefully that is " + income + " per hour" );
         System.out.println( " and not per year!" );
         System.out.print( "Well, thanks for answering my rude questions, " );
         System.out.println( name + "." );
         
         /* If you enter an integer when it expects a double, I would guess this is fine
         because it is still a number easily converted to a double and takes less memory.
         Also, if you enter numeric when program expects a string, I would guess 
         this is fine because a numeric is still a string character. */
         
         
         
     }
 }

 