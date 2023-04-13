import java.util.Scanner;
class ArrayMenu{
  static void insert(int n, int a[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array values");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
  }
  static void insertfirst(int Newelement,int a[],int n){
    Scanner sc=new Scanner(System.in);
    Newelement=sc.nextInt();
    for(int i=n-1;i>=0;i--){
      a[i+1]=a[i];
    }
    a[0]=Newelement;
  }
   static void insertlast(int Newelement,int a[],int n){
    Scanner sc=new Scanner(System.in);
    Newelement=sc.nextInt();
    for(int i=n-1;i>=n;i--){
      a[i+1]=a[i];
    }
    a[n]=Newelement;
   }
  static int[] display(int a[]){
    return a;
    }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[50];
    int ch=0;
    int Newelement=0;
    char c='y';
    System.out.println("Enter number of Elements you want to insert");
    int n=sc.nextInt();
    do{
      System.out.println("Enter your choice ");
      System.out.println("1.Insert into array");
      System.out.println("2.Insert element to first");
      System.out.println("3.Insert element to last");
      System.out.println("4.Insert element to specific position");
      System.out.println("5.Delete at first");
      System.out.println("6.Delete at last");
      System.out.println("7.Delete at Specific position");
      System.out.println("8.Search");
      System.out.println("9.Frequency of each number");
      System.out.println("10.Display");
      System.out.println("11.Exit");
      System.out.println("-----Choose between 1-12--------");
      ch=sc.nextInt();
      switch(ch){
        case 1:
          insert(n,a);
          break;
        case 2:
          System.out.println("Enter new element");
          insertfirst(Newelement,a,n);
          break;
        case 3:
          
        case 10:
          int d[]=display(a);
           System.out.println("Array Values");
          for(int i=0;i<=n;i++)
            System.out.println("a["+i+"]="+d[i]);
          break;
      }
      System.out.println("Do you want to continue?");
      c=sc.next().charAt(0);
    }while(c!='n');
  }
}