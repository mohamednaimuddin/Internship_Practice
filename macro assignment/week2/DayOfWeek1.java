import java.time.LocalDate; 
import java.time.DayOfWeek;
import java.util.Scanner; 
import java.time.format.DateTimeFormatter;
class DayOfWeek1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);  
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    System.out.print("Enter date in DD-MM-YYYY format: "); 
    String i= sc.next(); 
    LocalDate date=  LocalDate.parse(i,dateFormat);
    DayOfWeek day = date.getDayOfWeek();
    System.out.println(day);
  }
}