import java.util.Scanner;
class LeapYear {
  public static void main (String arg[]){
    int year;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the year");
    year=sc.nextInt();
    if(year%4==0&&year%100!=0||year%400==0){
      System.out.println("Yes !,this is leap year");
    }
    else{
      System.out.println("this is not leap year");
    }
    
  }
}