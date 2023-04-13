import java.util.regex.*;
import java.util.Scanner;
class UserName{
  static boolean verify(String username,String password){
    String regex="^(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[@#$%^&+=])(?=\\S+$).{8,}$";
    if(username.matches(regex)&&password.matches(regex)){
      return true;
    }
    else{
      return false;
    }  
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your username : ");
    String username=sc.nextLine();
    System.out.println("Enter your password : ");
    String password=sc.nextLine();
    if (verify(username,password)){
      System.out.println("username and password are valid");
    }
    else{
      System.out.println(" username and password not valid");
    }
  }
}
