import java.util.Scanner;
class MulMatrices{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Size of Matrics");
    int n=sc.nextInt();
    int a[][]=new int[n][n];
    int b[][]=new int[n][n];
    int mul[][]=new int[n][n];
    System.out.println("Enter mattrice A");
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        a[i][j]=sc.nextInt();
      }
      System.out.println();
    }
    System.out.println("Enter matrice B");
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        b[i][j]=sc.nextInt();
      }
      System.out.println();
    }
    System.out.println("Mul of Matrices:");
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        mul[i][j]=a[i][j]*b[i][j];
        System.out.println(mul[i][j]);
      }
      System.out.println();
    }
  }
}