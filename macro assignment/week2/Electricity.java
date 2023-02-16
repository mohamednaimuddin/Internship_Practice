import java.util.Scanner;
class Electricity{
  public static void main(String args[]){
    int unit;
    double amount,total_amount,charge_amount;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    unit=sc.nextInt();
    if (unit <= 50){
      amount=unit*0.50;
    }
    else if (unit<=150){
      amount = 25+((unit-50)*0.75);
    }
    else if (unit <= 250){
      amount = 100+((unit-150)*1.20);
    }
    else{
      amount=220 + ((unit-250)*1.50);
    }
    charge_amount=amount * 0.20;
    total_amount=amount + charge_amount;
    System.out.println("Electricity bull price="+total_amount);
  }
}