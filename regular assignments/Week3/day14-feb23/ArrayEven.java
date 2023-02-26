import java.util.Scanner;
class ArrayEven{
  public static void main(String args[]){
    //declare varaible
    int a[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter values");
    //read data
    for(int i=0;i<5;i++){
     a[i]=sc.nextInt();
   }
    
    //print even  numbers
    System.out.println("******Array Even Number******");
    for(int i=0;i<5;i++){
      if(a[i]%2==0){
        System.out.println(a[i]);
      }
      
    }
  }
}