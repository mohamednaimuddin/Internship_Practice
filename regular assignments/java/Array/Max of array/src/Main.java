public class Main {
    public static void main(String[] args) {
        System.out.println("max of array ");
        int a[]={2,6,15,54,46};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }

        }
        System.out.println("maximum number in array is : "+max);
    }
}