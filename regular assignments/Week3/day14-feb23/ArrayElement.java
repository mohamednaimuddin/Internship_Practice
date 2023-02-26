import java.util.Scanner;
class ArrayElement{
  public static void main(String args[]){
    //declare varaible
    double a[]=new double[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter values");
    //read data
    for(int i=0;i<5;i++){
     a[i]=sc.nextDouble();
   }
    //display data
    System.out.println("******Array Elements******");
    for(int i=0;i<5;i++){
      System.out.println("a["+i+"]="+a[i]);
    }
  }
}