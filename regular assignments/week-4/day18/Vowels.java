import java.util.*;
class Vowels{
  static void vowels(String str){
    char a[]=str.toCharArray();
    int count=0;
    for(int i=0;i<a.length;i++){
      if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'){
        System.out.println(a[i]);
        count++;
      }
    }
    System.out.println("COunt = "+count);
  }
  public static void main(String args[]){
    vowels("Mohamed Naimuddin");
  }
}