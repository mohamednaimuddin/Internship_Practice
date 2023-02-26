//print negitive numbers from an array
import java.util.Scanner;
  class ArrayNegative{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int a[]=new int[5];
      System.out.println("enter the array :");
      for(int i=0;i<5;i++){
        a[i]=sc.nextInt();
      }
      System.out.println("array of negative number ");
      for(int i=0;i<5;i++){
        if(a[i]<0){
          System.out.println(a[i]);
        }
      }
   } 
  }