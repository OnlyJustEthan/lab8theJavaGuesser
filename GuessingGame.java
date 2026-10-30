//GuessingGame.java

import java.util.*;

public class GuessingGame {
  
  String nameRequest = "\nPlease enter your name: ";
  boolean gameGoing = true;
  String userName;
  
  public static void main(String[] args){ // Public, accessable to all instances, no return, main with a string array of arguments
    new GuessingGame();
  } // This is 'main', used primarily to create an instance of the class.
  
  public GuessingGame(){
    Scanner input = new Scanner(System.in);
    System.out.print(nameRequest);
    userName = input.nextLine();
    System.out.print("\nHello "+ userName + ", welcome to the guessing games!\n\nWhich game would you like to play?\n\n");
    MainMenu();
  } // constructor

  public void MainMenu(){
    while(gameGoing){
      Scanner choice = new Scanner(System.in);
      //System.out.print("This will be the main menu.\n");
      System.out.print("Please Select a Mode: \n");
      System.out.print("0: Quit\n");
      System.out.print("1: Computer Picks Number, Human Guesses\n");
      System.out.print("2: Human Picks Number, Computer Guesses\n");
      System.out.print("Choice: ");
      try{
      int mode = Integer.parseInt(choice.nextLine());
        if(mode == 0){
          System.out.print("\nUntil next time " + userName + "!\n");
          gameGoing = false;
        }//end if
        else if(mode == 1){
          HumanGuesser();
        }//end elseif
        else if(mode == 2){
          ComputerGuesser();
        }//end elseif
        else{
          System.out.print("\nInvalid input, please type '0', '1', or '2'.\n\n");
        }//end else
      //System.out.print(mode + "\n");// Test for Scanner input
      }catch(NumberFormatException e){
        System.out.print("\nInvalid input, please type '0', '1', or '2'.\n\n");
      }//end try catch
    }//end while
  }//end MainMenu

  public void HumanGuesser(){
    boolean keepGoing = true;
    int min = 1;
    int max = 101;
    int target = (int)(Math.random() * ((max - min) + 1) + min);
    while(keepGoing){
      System.out.print("\nHuman Guesser Placeholder for number " + target + "\n\n");
      keepGoing = false;
    }
  }//end HumanGuesser
  
  public void ComputerGuesser(){
    System.out.print("\nComputer Guesser Placeholder\n\n");
  }//end ComputerGuesser

} // end class definition
