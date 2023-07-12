public class Main {
    public static void main(String[] args) {
        try{
            int a=10,b=0;
            int c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println("invalid division");
        }
        System.out.println("The end");

    }
}