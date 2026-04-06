package Classandobject;
import java.util.*;
public class student {
	int id;
	String Name;
	int age;
	String Address;
		
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	student s1=new student();
	System.out.println("Student Data:");
	System.out.println("Enter student id:");
	s1.id=sc.nextInt();
	sc.nextLine();
	System.out.print("Enter student Name:");
	s1.Name=sc.nextLine();
	System.out.print("Enter student age:");
	s1.age=sc.nextInt();
	sc.nextLine();
	System.out.print("Enter student Address:");
	s1.Address=sc.nextLine();
	
	System.out.println("student ID:"+s1.id);
	System.out.println("student Name:"+s1.Name);
	System.out.println("student Age:"+s1.age);
	System.out.println("student Address:"+s1.Address);
}
}
