import java.util.Scanner;
class ArrayCreateNDisplay1{
  static void create(int n,int a[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array element :");
    
    
    for (int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
    }
  static void display(int a[]){
    for(int i=0;i<5;i++){
    return a[i];
    }
   }
  public static void main(String args[]){
    int a[]=new int[50];
    create(5,a);
    int q=display(a);
    System.out.println(q);
    
  }
}