import java.util.Scanner;
class UserCase1{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of size of array");
   int n=sc.nextInt();
    int a[][]=new int[n][n];
    System.out.println("Enter elements of array");
    int count=0;
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        a[i][j]=sc.nextInt();
      }
      System.out.println();
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(a[i][j]<10 || a[i][j]!=20){
          if(a[i][j]<10)
          count++;
        }
      }
    }
    System.out.println(count);
  }
}