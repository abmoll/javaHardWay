 import java.util.Scanner;
 
 public class EnterPIN {
     public static void main( String[] args ) {
         Scanner keyboard = new Scanner(System.in);
         int pin, entry;
         String passEntry, password;
 
         pin = 12345;
         password = "nantucket";
 
         System.out.println("WELCOME TO THE BANK OF JAVA.");
         System.out.print("ENTER YOUR PASSWORD: ");
         passEntry = keyboard.next();
         while ( ! passEntry.equals(password) ) {
             System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
             System.out.print("ENTER YOUR PASSWORD: ");
             passEntry = keyboard.next();
    	 }
         
         System.out.print("ENTER YOUR PIN: ");
         entry = keyboard.nextInt();
 
         while ( entry != pin ) {
             System.out.println("\nINCORRECT PIN. TRY AGAIN.");
             System.out.print("ENTER YOUR PIN: ");
             entry = keyboard.nextInt();
         }
 
         System.out.println("\nPIN AND PASSWORD ACCEPTED. ACCOUNT BALANCE: $425.17");
     }
 }
