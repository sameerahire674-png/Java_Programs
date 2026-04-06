package Inheritance;

public class first {
 int empid;
 String Name ;
 double salary;
 int age;
 String location;
 String company;
public first(int empid, String name, double salary, int age, String location, String company) {
	super();
	this.empid = empid;
	Name = name;
	this.salary = salary;
	this.age = age;
	this.location = location;
	this.company = company;
}
 
 void result() {
	 if (location=="pune") {
		 System.out.println("Yes Your Locatino is correct:");
	 }else if (location =="Benglore") {
		 System.out.println("Your location is so long:");
	 }
	 else {
		 System.out.println("Not Its Very Long so dificulty loaction and travelling problem");
	 }
 }

//@Override
//public String toString() {
//	return "first [empid=" + empid + ", Name=" + Name + ", salary=" + salary + ", age=" + age + ", location=" + location
//			+ ", company=" + company + "]";
//}

}

