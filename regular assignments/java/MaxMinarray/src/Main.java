import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the element of array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] <min) {
                min = arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("smallest element present in given array: " + min);
        System.out.println("largest element present in given array: " + max);
    }
}