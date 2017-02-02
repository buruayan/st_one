
package sub;
import java.util.Scanner; // needed for Scanner
public class Sub {
   private static final Scanner scanner = new Scanner( System.in );
 public static void main ( String [] args )
 {
 // Prompt the user
 System.out.print( "Input first number: " );
 // Read a line of text from the user.
 String alpha = scanner.nextLine();
 int bravo= Integer.parseInt(alpha);
  System.out.print( "Input second number: " );
 // Read a line of text from the user.
 String charlie = scanner.nextLine(); 
 int delta= Integer.parseInt(charlie);
 
 System.out.print("Subtraction result="+ sub(bravo,delta));
    }
 
 
public static int sub(int a,int b){
    int c=b-a;
    return c;
}
}
