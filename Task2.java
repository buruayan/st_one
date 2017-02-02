
package task2;
import java.util.Scanner; // needed for Scanner
/* A Java program that demonstrates console based input and output. */
public class Task2 {

 // Create a single shared Scanner for keyboard input
 private static final Scanner scanner = new Scanner( System.in );
 // Program execution starts here
 public static void main ( String [] args )
 {
 // Prompt the user1
 System.out.print( "Do you reckon that the team you back will win?: " );
 // Read a line of text from the user.
 String input1 = scanner.nextLine();
  // Prompt the user2
  System.out.print( "What has been their recent form?: " );
  String input2 = scanner.nextLine();
   // Prompt the user3
 System.out.print( "Are there any injured players?: " );
 String input3 = scanner.nextLine();
   // Prompt the user4
 System.out.print( "How do you expect the manager to line up his squad?: " );
  int squad = scanner.nextInt();
  // Prompt the user5
  System.out.print( "What are the betting odds in favour of your team?: " );
 float d = scanner.nextFloat();
 System.out.print( "How much money will you gamble on a win?: " );
 int stake = scanner.nextInt();
 float winnings=stake*d;
 System.out.print( "How many points did the team collect?: " );
  int ans = scanner.nextInt();
  if(ans==3){
 System.out.println("Congratulations you have won!!"+winnings +"sh");
}
  else if(ans<3){
 
 System.out.println("Loss,Please play responsibly");

 }
}
}




/**
 *
 * @author 74679
 */
