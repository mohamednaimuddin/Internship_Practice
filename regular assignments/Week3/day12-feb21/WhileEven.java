import java.util.Scanner;
class WhileEven{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value");
    n=sc.nextInt();
    int i=2;
    while(i<=n){
      System.out.println(i);
      i=i+2;
    }
  }
}