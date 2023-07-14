import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i =0;
        boolean flag=false;
        System.out.println("The given Array :");
        int arr[]={5,6,8,3};
        System.out.println("Enter the integer to search :");
        int number=sc.nextInt();
        for (i=0;i<= arr.length-1;i++){
            System.out.println(arr[i]);
            if(number==arr[i]){
                flag=true;
            }
        }
        if(flag==true){
            System.out.println("integer found in array");
        }


    }
}