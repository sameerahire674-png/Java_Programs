package practice;
// How many digits in 
import java.util.*;
public class totalNnumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
//	System.out.print("Enter the number You want to check given Total number:");
//	int n=sc.nextInt();
//	int numofDigits=0;
//	int originalnum=n;
//	while(n>0) {
//		n=n/10;
//		numofDigits++;
//	}
//		System.out.println("The Count number Digits is:"+originalnum+"="+numofDigits);
	
	
	
	//swapping two number with temperory variable
//	System.out.println("enter a first number:a=");
//	int a=sc.nextInt();
//	System.out.println("enter second number:b=");
//	int b=sc.nextInt();
//	int c=b;
//	b=a;
//	a=c;
//	System.out.println("a:"+a+"b:"+b);
	
	
//	swapping two numbers without thrid variable
	
//	System.out.println("Enter a First Number:");
//	int a=sc.nextInt();
//	System.out.println("Enter b second Number:");
//	int b=sc.nextInt();
//	a=a+b;
//	b=a-b;
//	a=a-b;
//	System.out.println("a="+a+"b="+b);
	
	
	// swapping two number using *,/ Operator
	System.out.println("Enter a First Number:");
	int a=sc.nextInt();
	System.out.println("Enter b second Number:");
	int b=sc.nextInt();
//	a=a*b;
//	b=a/b;
//	a=a/b;
	b=a+b-(a=b);
	System.out.println("a="+a+"b="+b);



}
}
