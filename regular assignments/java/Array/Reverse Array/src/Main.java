public class Main {
    public static void main(String[] args) {
        System.out.println("orginal  array :");
        String arr[]={"apple","banana","orange","mango","car","lorry","bus"};
        for(int i=0;i<= arr.length-1;i++){
            System.out.println(arr[i]);
        }
        System.out.println("reverse d array :");
        for(int i= arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }

    }
}