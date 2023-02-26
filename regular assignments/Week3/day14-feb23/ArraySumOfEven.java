// print sum of even numbers
import java.util.Scanner;
class ArraySumOfEven{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
      int a[]=new int[5],sum=0;
    System.out.println("enter the array values");
    for(int i=0;i<5;i++){
     a[i]=sc.nextInt();
    }
    for(int i = 0;i<5;i++){
      if(a[i]%2==0){
        sum=sum+a[i];
      }
    }
    System.out.println("Sum of Even number : "+sum);
  }
}