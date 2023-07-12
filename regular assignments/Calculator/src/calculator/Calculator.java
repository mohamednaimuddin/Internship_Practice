package calculator;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 number :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result=0;
		System.out.println("Enter the operator (+,-,/,*):");
		char op=sc.next().charAt(0);
		
		switch (op) {
		case '+' :
			result =a+b;
			break;
		case '-' :
			result =a-b;
			break;
		case '*' :
			result =a*b;
			break;
		case '/' :
			result =a/b;
			break;
		}
		
		System.out.println(a+" "+op+" "+b+" = "+result);
	}

}
