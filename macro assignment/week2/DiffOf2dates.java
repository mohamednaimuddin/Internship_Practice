import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
class DiffOf2dates {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    System.out.print("Enter the first date (dd-mm-yyyy): ");
    LocalDate d1 = LocalDate.parse(sc.next(),dateFormat);
    System.out.print("Enter the second date (dd-mm-yyyy): ");
    LocalDate d2 = LocalDate.parse(sc.next(),dateFormat);
    long days = ChronoUnit.DAYS.between(d1, d2);
    System.out.println("The difference between the two dates is " + Math.abs(days) + " days.");
  }
}