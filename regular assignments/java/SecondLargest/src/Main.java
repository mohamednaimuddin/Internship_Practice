//51. Write a JAVAprogram to find second-largest element in an array.
import java.util.*;
public class Main
{
    public static int secondLargest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-2];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the element of array :");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Second Largest: "+secondLargest(a,n));
    }
}
