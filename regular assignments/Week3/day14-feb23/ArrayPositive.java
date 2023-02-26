//print postive numbers from an array
import java.util.*;
class ArrayPositive{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    System.out.println("enter the array values");
    for(int i=0;i<5;i++){
     a[i]=sc.nextInt();
    }
    System.out.println("******Array Positive Number******");
    for(int i=0;i<5;i++){
      if(a[i]>0){
        System.out.println(a[i]);
      }
    }
  }
}