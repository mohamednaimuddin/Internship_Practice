import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
class AddDaysToDate1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in); 
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    System.out.println("Enter date in dd-mm-yyyy format: ");
    String input = sc.next(); 
    LocalDate date=  LocalDate.parse(input,dateFormat);
    System.out.println("Enter number of days to be added: ");
    int n=sc.nextInt();
    LocalDate newdate=date.plusDays(n);
    System.out.println(newdate);
  }
}