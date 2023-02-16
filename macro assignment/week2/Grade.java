// 13. WAP to input marks of five subjects Physics, Chemistry, Biology,     Mathematics and Computer. Calculate percentage and grade according to     following:
//     Percentage >= 90% : Grade A
//     Percentage >= 80% : Grade B
//     Percentage >= 70% : Grade C
//     Percentage >= 60% : Grade D
//     Percentage >= 40% : Grade E
//     Percentage < 40% : Grade F

import java.util.Scanner;
class Grade{
  public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter mark of Physics :");
    float phy=sc.nextFloat();
    System.out.println("Enter mark of Chemistry :");
    float chem=sc.nextFloat();
    System.out.println("Enter mark of Biology :");
    float bio=sc.nextFloat();
    System.out.println("Enter mark of Mathematics :");
    float maths=sc.nextFloat();
    System.out.println("Enter mark of compuetr :");
    float comp=sc.nextFloat();
    float percentage=((phy+chem+bio+maths+comp)/500)*100;
    System.out.println("your percentage is "+percentage);
    if(percentage>=90){
      System.out.println("Grade A");
    }
    else if(percentage>=80){
      System.out.println("Grade B");
    }
    else if(percentage>=70){
      System.out.println("Grade C");
    }
    else if(percentage>=60){
      System.out.println("Grade D");
    }
    else if(percentage>=40){
      System.out.println("Grade E");
    }
    else if (percentage<40){
      System.out.println("Grade F");
    }
  }
}