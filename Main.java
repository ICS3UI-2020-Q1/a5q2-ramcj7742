import java.util.Scanner;
/**
 * Gets user to enter a positive number and counts up to it
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner(System.in);

    //gets number from user
    System.out.println("Please enter a positive integer");
    int userNum = input.nextInt();

    //for loop to print numbers to screen
    for(int i = 1; i < userNum; i++){
      System.out.print(i + ", ");
    }
    //prints last number(gets rid of comma at end)
    System.out.print(userNum);
    
  }
}
