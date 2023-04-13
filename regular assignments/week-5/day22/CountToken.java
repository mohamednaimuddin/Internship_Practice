import java.util.StringTokenizer;
class CountToken{
  public static void main(String args[]){
    StringTokenizer s = new StringTokenizer("Welcome to bitlabs");
    int count=0;
    while(s.hasMoreTokens()){
      System.out.println(s.nextToken());
      count++;
    }
  System.out.println(count);
  }
}