//50. Write a JAVAprogram to print all negative elements in an array.
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the element in the array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i =0;i<n;i++){
            if(a[i]<0){
                System.out.println(a[i]);
            }
        }
    }
}