import java.util.Scanner;
class SwitchWeek{
  public static void main(String args[]){
    int number;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number 1-7 to display the weekdays sunday-saturday respectively");
    number=sc.nextInt();
    switch(number){
      case 1:
        System.out.println("Sunday");
        break;
      case 2:
        System.out.println("Monday");
        break;
      case 3:
        System.out.println("Tuesday");
        break;
      case 4:
        System.out.println("Wednesday");
        break;
      case 5:
        System.out.println("Thursday");
        break;
      case 6:
        System.out.println("Friday");
        break;
      case 7:
        System.out.println("Saturday");
        break;
      default:
        System.out.println("Invalid number");
      
    }
  }
}