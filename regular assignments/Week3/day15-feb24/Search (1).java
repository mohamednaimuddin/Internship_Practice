import java.util.Scanner;
class Search{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of array :");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the all the "+n+" element of array");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Enter the element you want to search");
    int search=sc.nextInt();
    int count=0;
    for(int j=0;j<n;j++){
      count++;
      if(search==arr[j]){
        System.out.println("Element is found at the pos "+j);
      }
      else if(count==0){  
        System.out.println("Element not found");
      }
    }
  }
}