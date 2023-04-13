import java.util.*;
class ReverseString{
  static void Reverse(String str){
    char a[]=str.toCharArray();
    String rev="";
    for (int i=a.length-1;i>=0;i--){
      rev=rev+a[i];
    }
    System.out.println(rev);
  }
  public static void main(String arg[]){
    Reverse("naimuddin");
  }
}