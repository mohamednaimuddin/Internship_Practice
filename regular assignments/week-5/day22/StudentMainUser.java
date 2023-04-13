import java.util.Scanner;
class Student{
  int id;
  String name;
  String Branch;
  double sub1,sub2,sub3;

  void avg(){
    double average=(sub1+sub2+sub3)/3;
    System.out.println(name +" average score is "+average);
  }
  void Percentage(){
    double totalScore=sub1+sub2+sub3;
    double per=(totalScore/300)*100;
    System.out.println(name +"Percentage is "+per);
  }
}
class StudentMainUser{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Student s1=new Student();
    System.out.println("Enter id of student1");
    s1.id=sc.nextInt();
    
    System.out.println("Enter name of student1");
    s1.name=sc.nextLine();
    
    System.out.println("Enter branch of student1");
    s1.Branch="CSE";
    
    System.out.println("Enter Subject 1 mark");
    s1.sub1=sc.nextDouble();
    
    System.out.println("Enter Subject 2 mark");
    s1.sub2=sc.nextDouble();
    
    System.out.println("Enter Subject 3 mark");
    s1.sub3=sc.nextDouble();
    
    s1.avg();
    s1.Percentage();

    
    Student s2=new Student();
    System.out.println("Enter id of student");
    s2.id=sc.nextInt();
    
    System.out.println("Enter name of student");
    s2.name=sc.nextLine();
    
    System.out.println("Enter branch of student");
    s2.Branch=sc.nextLine();
    
    
    System.out.println("Enter Subject 1 mark");
    s2.sub1=75;
    
    System.out.println("Enter Subject 2 mark");
    s2.sub2=87;
    
    System.out.println("Enter Subject 3 mark");
    s2.sub3=66;
    
    s2.avg();
    s2.Percentage();
  }
}