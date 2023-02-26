import java.util.Scanner;

class Strong{
  public static void main(String args[]){  
    Scanner sc = new Scanner(System.in);  
    System.out.print("Enter a number: "); 
    int n=sc.nextInt();
    int fact=1;
    int rem=0,sum=0;

    while(n>1){
      rem=n%10;
      for(int i=1;i<=rem;i++);{
        fact=fact*i;
      }  
      n=n/10;
      sum=sum+fact;
    }
    if(rem==0){
      System.out.println(n+" is a Strong number");
    }
    else{
      System.out.println(n+ "is not a Strong number");
    }
      
  }
}