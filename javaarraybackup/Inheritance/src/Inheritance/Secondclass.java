package Inheritance;

//public class Secondclass extends Firstclass {
//	void display() {
//	int age=12;
//	if(age>=18) {
//		super.display(balance);
//		System.out.println("yes processing");
//	}else
//	{
//		System.out.println("Failed processing..");
//	}
//	}	
//	void withdraw() {
//		System.out.println("");
//	}
public class Secondclass{
	String companyName;
	String location;
	int empId;
	
public Secondclass(String companyName, String location, int empId) {
		super();
		this.companyName = companyName;
		this.location = location;
		this.empId = empId;
		
}
//@Override
//public String toString() {
//	return "Secondclass [CompanyName=" + companyName + ", location=" + location + ", empId=" + empId + "]";
//}
void displaycourse() {
System.out.println("company name    :"+companyName);
System.out.println("company location:"+location);
System.out.println("company empid   :"+empId);
}


//public static void main(String[] args) {
//	//Secondclass sc1= new Secondclass();
////	sc1.balance=500;
////	sc1.display(1000);
////	sc1.display(10000);
////	sc1.display();
////	System.out.println("Your fianl Amount is:");
//}
}
