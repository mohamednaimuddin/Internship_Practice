import java.util.Scanner;
class CountEven{
  public static void main(String args[]){
    //declare varaible
    int a[]=new int[5],count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter values");
    //read data
    for(int i=0;i<5;i++){
     a[i]=sc.nextInt();
   }
    for(int i=0;i<5;i++){
      if(a[i]%2==0){
        count++;
      }
    }
    System.out.println("Even Count ="+count);
  }
}