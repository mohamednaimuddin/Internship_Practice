class SumOfRow{
  public static void main(String args[]){
    int a[][]={{1,2,3},{4,5,6},{7,8,9}};
  
    for(int i =0;i<3;i++){
      int sum=0;
      for(int j=0;j<3;j++)
        {
          System.out.print(a[i][j]+" ");
          sum=sum+a[i][j];  
        }
      System.out.println();
      System.out.println("sum is " + sum);
    }

  }
}