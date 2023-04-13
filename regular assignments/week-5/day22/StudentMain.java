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
class StudentMain{
  public static void main(String args[]){
    Student s1=new Student();
    s1.id=38;
    s1.name="Naimu";
    s1.Branch="CSE";
    s1.sub1=80;
    s1.sub2=85;
    s1.sub3=90;
    s1.avg();
    s1.Percentage();
    Student s2=new Student();
    s2.id=39;
    s2.name="Naimu2";
    s2.Branch="CSE";
    s2.sub1=75;
    s2.sub2=87;
    s2.sub3=66;
    s2.avg();
    s2.Percentage();
  }
}