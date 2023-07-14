public class Main {
    public static void main(String[] args) {
        System.out.println("minimum number in array:");
        int a[]={5,7,9,11,66,45,6};
        int min=a[0];
        for (int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("minimum value in array : "+min);
    }
}