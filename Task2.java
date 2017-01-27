
package task2;
import java.util.Scanner;
public class Task2 { 

 // Program execution starts here
 public static void main(String [] args )
 {
     Scanner scanner=new Scanner(System.in);
    
 // Prompt the user1
 System.out.print( "Why are you backing that team to win?: " );
 // Read a line of text from the user.
 String a = scanner.nextLine();
 // Prompt the user2
  System.out.print( "What has been their recent form?: " );
  String b = scanner.nextLine();
  // Prompt the user3
 System.out.print( "Are there any injured players?: " );
 String c = scanner.nextLine();
   // Prompt the user4
 System.out.print( "How do you expect the manager to line up his squad?: " );
  int squad = scanner.nextInt();
  // Prompt the user3
 System.out.print( "What is your final score prediction?: " );
 int finale = scanner.nextInt();
  // Prompt the user3
 System.out.print( "Lastly,are the bookies odds in your favour?: " );
 float d = scanner.nextFloat();
 
 }
}
