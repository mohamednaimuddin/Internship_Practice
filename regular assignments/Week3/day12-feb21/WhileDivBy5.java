import java.util.*;
class WhileDivBy5{
public static void main (String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number N");
  int n=sc.nextInt();
  int i=1;
  while(i<n){
    if(i%5==0){
      System.out.println(i);
    }
    i++;
  }
  }
}