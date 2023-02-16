//1. Rock Paper Scissors Program :  Create a simple game of rock-paper-scissors where the user plays against the computer. Use conditional statements to determine the winner of each round

import java.util.Scanner;
class RockPaper{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Select options Rock Paper Scissor: ");
    String userChoice;
    String computerChoice;
    System.out.println("Enter user choice: ");
    userChoice=sc.next();
    System.out.println("Enter computer choice");
    computerChoice=sc.next();
    if(userChoice.equals("computerChoice")){
      System.out.println("Tie");
      
    }
    else if((userChoice.equals("Paper"))&&(computerChoice.equals("Rock"))||(userChoice.equals("Scissor"))&&(computerChoice.equals("Paper"))||(userChoice.equals("Rock"))&&(computerChoice.equals("Scissor"))){
      System.out.println("user wins");
    }
    else if((computerChoice.equals("Paper"))&&(userChoice.equals("Rock"))||(computerChoice.equals("Scissor"))&&(userChoice.equals("Paper"))||(computerChoice.equals("Rock"))&&(userChoice.equals("Scissor"))){
      System.out.println("computer wins");
    }
    else{
      System.out.println("invalid input!!");
    }
  }
}
