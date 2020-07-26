
import java.util.*; 


public class Project2 {

  public static void main(String[] args) {


    Scanner user_input = new Scanner(System.in);
    
    
    System.out.println("How many people are you annoyed with?");
    int x = user_input.nextInt();
    String[] names = new String[x+1];
    System.out.println("Input the names of the people you are annoyed with.");
    for (int i = 0; i <= x;i++) {
      names[i] = user_input.nextLine();
    };
    System.out.println("What would you want to scream at all these people?");
    String scream = user_input.nextLine();
    System.out.println("You scream '" + scream + "' at:");
    for (String s: names) {
      System.out.println(s);
    };
    System.out.println("Did that help? (y/n)");
    String yn = user_input.nextLine();
    if (yn.equals("y")) {
      System.out.println("Glad to help");
    }
    else {
      if (yn.equals("n")) {
        System.out.println("Sorry, there is nothing more I can do for you.");
      }
      else {
        System.out.println("You didn't input 'y' or 'n' I'll just assume this program helped");
      }
    }
    }
  }

