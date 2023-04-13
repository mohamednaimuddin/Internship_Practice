import java.util.*;
class Employee{
  int eid;
  String name;
  double salary;

  Employee(int id,String n,double sal){
    eid=id;
    name=n;
    salary=sal;
  }
  
  void grossSalary(double hra,double da){
    double totalSalary=hra+da+salary;
    System.out.println(totalSalary);
  }

  void display(){
    System.out.println(eid+" "+name+" "+salary);
  }
}

public class EmployeeMain{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter NUmber of employee");
    int n=sc.nextInt();
    Employee emp[]=new Employee[n];
    for (int i=1;i<=n;i++){
      System.out.println("Enter Employess "+i+ "information");
      emp[i]=new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
    }
    for(int i=1;i<=n;i++){
      System.out.println("**********Employee " +i+ " Informatiob **********");
      emp[i].display();
      System.out.println("Enter HRA and DA ");
      emp[i].grossSalary(sc.nextDouble(),sc.nextDouble());
    }
  }
}
