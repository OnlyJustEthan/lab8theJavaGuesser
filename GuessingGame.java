//GuessingGame.java

import java.util.*;

public class GuessingGame {
  
  String nameRequest = "\nPlease enter your name: ";
  boolean gameGoing = true;
  
  public static void main(String[] args){ // Public, accessable to all instances, no return, main with a string array of arguments
    new GuessingGame();
  } // This is 'main', used primarily to create an instance of the class.
  public GuessingGame(){
    Scanner input = new Scanner(System.in);
    System.out.print(nameRequest);
    String userName = input.nextLine();
    System.out.print("\nHello "+ userName + ", welcome to the guessing games!\n\nWhich game would you like to play?\n\n");
    MainMenu();
  } // constructor
  public void MainMenu(){
    while(gameGoing){
      System.out.print("This will be the main menu.\n");
      gameGoing = false;
    }//end while
  }//end MainMenu
  public int MachineGuesser(){
    return(0);
  }//end MachineGuesser
  public int HumanGuesser(){
    return(0);
  }//end HumanGuesser
} // end class definition
