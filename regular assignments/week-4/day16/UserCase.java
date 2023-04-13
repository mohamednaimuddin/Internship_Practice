import java.util.Scanner;
class UserCase{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=sc.nextInt();
    int count=0;
    int a[][]=new int [n][n];
    for (int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        a[i][j]=sc.nextInt();
      }
    }
    for (int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        System.out.print(a[i][j]+" ");
        if(a[i][j]>10&&a[i][j]!=20){
          count++;
          break;
        }
      }
      System.out.println();
    }
    if(count==0){
      System.out.println("yes");
    }
    else{
      System.out.println("No");
    }
  }
}