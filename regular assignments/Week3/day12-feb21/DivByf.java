import java.util.*;
class DivByf { 
  public static void main(String args[]){     
    int n;     
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter n value");
    n=sc.nextInt();      
    for(int i=1;i<=n;i++){ 
      if(i%5==0){
        System.out.println(i);   
      }       
    } 
  }  
}