package Inheritance;

public class second extends first {
 String companylocation;
 int empno;
 String emprole;
public second(int empid, String name, double salary, int age, String location, String company, String companylocation,
		int empno, String emprole) {
	super(empid, name, salary, age, location, company);
	this.companylocation = companylocation;
	this.empno = empno;
	this.emprole = emprole;
}
//@Override
//public String toString() {
//	return "second [companylocation=" + companylocation + ", empno=" + empno + ", emprole=" + emprole + "]";
//}


 void display() {
	 System.out.println("This is Our my employee data Comapny Details; ..");
 }
 
}
