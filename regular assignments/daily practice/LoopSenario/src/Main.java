import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0D;

        System.out.println("Enter the prices of the items || enter -1 to stop:");

        while (true) {
            double price = scanner.nextDouble();

            if (price == -1) {
                break;
            }

            totalPrice =totalPrice + price;
        }

        System.out.println("Total price: " + totalPrice);
    }
}
