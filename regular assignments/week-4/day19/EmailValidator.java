import java.util.regex.*;
import java.util.Scanner;


class EmailValidator{
  static boolean Verify(String email){
    String patternString="[a-zA-Z0-9._%+-]+[@]+[a-zA-Z]+\\.[a-z]{2,3}$";
    Pattern pattern = Pattern.compile(patternString);
    Matcher matcher=pattern.matcher(email);
    return matcher.matches();
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String email=sc.nextLine();
    Boolean op=Verify(email);
    if(op==true){
      System.out.println("Matched!");
    }
    else{
      System.out.println("not matched!");
    }
    
  }
}
