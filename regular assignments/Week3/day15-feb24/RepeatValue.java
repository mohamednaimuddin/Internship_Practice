import java.util.*;
class RepeatValue{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Size of array :");
    int n=sc.nextInt();
    int a[]=new Int[n];
    System.out.println("Enter the all "+n+" element :");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("Enter the value ");
    int search=sc.nextInt();
    int count=0;
    for(int j=0;j<n;j++){
      if(a[j]==search){
        count++;
      }
    }
      System.out.println("the element is repeated:-"+count);
  }
}