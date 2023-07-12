public class Main {
    public static void main(String[] args) {
        int arr[] = {2,6, 4, 5};
        boolean flag = true;
        for (int i = 0; i<arr.length-1; i++) {
            if (arr[i]>arr[i+1]) {
                flag = false;
                break;
            }
        }
        if (flag==true) {
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}