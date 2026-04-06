 package nonaccess;
import java.util.*;
public class salary {
	static  String companyName;

	int id;
	String role;
	String name;
//	void Roles() {
//		if(role.equals(java)) {
//			System.out.println("The java developer salry is:");
//		}else if(role.equals(python)) {
//			System.out.println("the python daveloper salary is:");
//		}else if(role.equals(webdeveloper)) {
//			System.out.println("the web developer salry is:");
//		}else {
//			System.out.println("this is invalid role");
//		}
//	}
	void rolessalry() {
		double salary=800;
		double monthlysalary=salary*30;
		System.out.println("The java developer salry is :"+monthlysalary);
	}
	public salary(int id, String role, String name) {
		super();
		this.id = id;
		this.role = role;
		this.name = name;
	}
	void display() {
		System.out.println("Company Name:"+companyName);
		System.out.println("Eneter employee id:"+id);
		System.out.println("Eneter employee role:"+role);
		System.out.println("Eneter employee name:"+name);
		
		rolessalry();
		System.out.println("==========================================================");
	}
	public static void main(String[] args) {
		int a=5;
		System.out.println(a);
		System.out.println(++a);
		companyName="Google";
	//	Scanner sc=new Scanner(System.in);
			salary sc1=new salary(1,"Java developer","Sameer");
			sc1.display();
	
	}
}
