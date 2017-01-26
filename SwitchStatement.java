package pkgswitch.statement;

public class SwitchStatement {

    public static void main(String[] args) {
        //char grade=args[0].charAt(0);
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent result!");
                break;
            case 'B':
                System.out.println("Fair");
                break;
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            case 'F':
                System.out.println("Try again");
                break;
            default:
                System.out.println("You entered an invalid grade");
        }
        System.out.println("Your grade is " +grade);
    }
}
        
/**
 *
 * @author 74679
 */
/**
 * @param args the command line arguments
 */
