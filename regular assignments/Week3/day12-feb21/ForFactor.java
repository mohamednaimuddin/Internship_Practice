import java.util.Scanner;
public class ForFactor {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numer : ");
    int n = sc.nextInt();
    System.out.print("Factors of " + n + " are: ");
    for (int i = 1; i <= n; ++i) {
      if (n % i == 0) {
        System.out.print("\n"+i+ "\n");
      }
    }
  }
}