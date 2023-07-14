import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        float sum=0;
        System.out.println("The array of given marks :" );
        float marks[]={50.6f,45.3f,66.66f,59,99.2f};
        for (int i=0;i<= marks.length-1;i++){
            System.out.println(marks[i]);
            sum=sum+marks[i];
        }
        System.out.println("Sum of marks : "+sum);
    }
}