public class Main {
    public static void main(String[] args) {
        float t=0;
        float pMarks[]={50.22f,46,49.3f,66,77,75.6f,80,99,91.3f};
        System.out.println("Physics marks of all student :");
        for (float element :pMarks){
            t=t+element;
        }
        float avg=t/ pMarks.length;
        System.out.println("Average marks = "+avg);

    }
}