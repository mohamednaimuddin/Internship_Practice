// Age Calculator  :  Create an application that takes a person's birthdate as input and calculates their current age. Use conditional statements to determine if they are a minor or an adult.
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period; 
class AgeCalculator {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Age Calculator");
    System.out.println("Enter the birthdate :");
    String birth_date;
    birth_date=sc.next();
    LocalDate today=LocalDate.now();
    System.out.println(today);
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate dateOfBirth = LocalDate.parse(birth_date, dateFormat);
    Period age=Period.between(dateOfBirth, today);
    System.out.println(age.getYears());
    if(age.getYears()>=18){
      System.out.println("Adult");
    }
    else{
      System.out.println("minor");
    } 
  }
}