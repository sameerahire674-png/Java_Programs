package Classandobject;
import java.util.*;
public class method {
	//without parameter and without return type
public void addition() {
	System.out.println("ADDITION OF NUMBERS:");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number:");
	int a=sc.nextInt();
	System.out.println("Enter second number:");
	int b=sc.nextInt();
	int c=a+b;
	System.out.println("Addition of two number:"+c); 
			
}

    //with parameter and without return type
public void substraction(int a , int b) {
	System.out.println("SUBSTRACTION OF NUMBERS:");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a first number:");
	 a=sc.nextInt();
	 System.out.println("Enter a second number:");
	 b=sc.nextInt();
	 int c=a-b;
		System.out.println("Substraction of two number:"+c);
	
}


// without parameter and with return type
public int multiplication() {
	System.out.println("MULTIPLICATION OF NUMBERS:");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a first number:");
	int a =sc.nextInt();
	System.out.println("Enter a second number:");
	int b=sc.nextInt();
	int c=a*b;
	return c;
}


// with parameter and with return type

public int division(int a, int b) {
	System.out.println("DIVISION OF NUMBERS:");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a first number:");
	a=sc.nextInt();
	System.out.println("Enter a second number:");
	b=sc.nextInt();
	int c=a/b;
	return c;
	

}

// jya type cha data dyaycha asel tyach type cha datatype declare karava//ex.int,string,float,char,double
public String sam() {
	String name="sameer Ahire";
	System.out.println(name);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	method m=new method();
	m.addition();
	System.out.println("==========================================");
	m.substraction(10, 20);
	System.out.println("==========================================");
	System.out.println("Multiplication of two number:"+m.multiplication());
	System.out.println("==========================================");
	System.out.println("Division of two number:"+m.division(0, 0));
	m.sam();
}
}
