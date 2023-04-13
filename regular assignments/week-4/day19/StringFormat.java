import java.util.*;
class StringFormat{
public static void main(String args[]){
  float n1=23.56f,n2=345.67f;
  float result=n1*n2;
  String result1=String.format("%-12.2f%-12.2f%-12.2f",result,result,result);
    System.out.println(result1);  
  String result2=String.format("%-12.2f%-12.2f%-12.2f",result,result,result);
      System.out.println(result2);
  }
}