import java.util.Scanner;
class LowerTriangle{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The lower triangular matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
  }
}