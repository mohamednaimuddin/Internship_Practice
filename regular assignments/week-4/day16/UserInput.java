import java.util.Scanner;
class UserInput{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a[][]=new int[3][2];
    int count=0;
    System.out.println("Enter the array element :");
    for (int i=0;i<3;i++){
      for(int j=0;j<2;j++){
        a[i][j]=sc.nextInt();
      }
    }
    System.out.println("Display array element");
    for (int i=0;i<3;i++){
      for(int j=0;j<2;j++){
        System.out.print(a[i][j]);
        if(a[i][j]==2){
          count++;
        }
      }
      System.out.println();
    }
    System.out.println("Number of 2 = " +count);
  }
}