import java.util.*;
class CountNegNPos{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5],pcount=0,ncount=0,zcount=0;
    System.out.println("enter the array values");
    for(int i=0;i<5;i++){
     a[i]=sc.nextInt();
    }
    for(int i=0;i<5;i++){
      if(a[i]>0){
      pcount++;
      }
      else if(a[i]==0){
        zcount++;
      }
      else{
        ncount++;
      }
      }
    System.out.println("Positive Count :"+pcount);
    System.out.println("Negative Count :"+ncount);
    System.out.println("Zero Count :"+zcount);
  }
}