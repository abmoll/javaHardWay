import java.util.Scanner;
 
 public class BMICalculator {
     public static void main( String[] args ) {
         Scanner keyboard = new Scanner(System.in);
         double m, kg, bmi;
         double lb, in, ft;
         
         System.out.print( "Your height (feet only): " );
         ft = keyboard.nextDouble();
 
         System.out.print( "Your height (inches only): " );
         in = keyboard.nextDouble();
 
         System.out.print( "Your weight in pounds: " );
         lb = keyboard.nextDouble();
         
         in = (ft * 12) + in;
         m = in / 39.37 ;
         kg = lb / 2.2 ;
 
         bmi = kg / (m*m);
 
         System.out.println( "Your BMI is " + bmi );
     }
 }