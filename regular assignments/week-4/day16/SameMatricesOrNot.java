import java.util.Scanner;
class SameMatricesOrNot{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Size of Matrics");
    int n=sc.nextInt();
    int q=0,w=0;
    int a[][]=new int[n][n];
    int b[][]=new int[n][n];
    System.out.println("Enter mattrice A");
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        a[i][j]=sc.nextInt();
        q = a[i][j];
      }
      System.out.println();
    }
    System.out.println("Enter matrice B");
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        b[i][j]=sc.nextInt();
        w=b[i][j];
      }
      System.out.println();
    }
    if(q == w){
      System.out.println("Both matrices are same");
    }
    else{
      System.out.println("Both matrices are not same");
    }
  }
}