// Length of token
import java.util.StringTokenizer;
class LengthOfString{
  public static void main(String args[]){
    StringTokenizer s= new StringTokenizer("Welcome to bitlabs");
    while(s.hasMoreTokens()){
      String str=s.nextToken();

      System.out.println(str.length());
    }

  }
}