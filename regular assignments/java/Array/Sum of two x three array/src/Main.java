public class Main {
    public static void main(String[] args) {
        System.out.println("Sum of 2 matrices :");
        int a[][]={{2 ,4 ,6 },{3 ,5 ,7 }};
        int b[][]={{7 ,5 ,3 },{6 ,4 ,2 }};

        int sum[][]={{0 ,0 ,0 },{0 ,0 ,0 }};

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println(" ");


        }


    }
}