package statements;

public class constructor {
 String username;
 String Password;
 String email;
 constructor(){
	 System.out.println("Hello guys");
 }
 
 // Constructor Statements
 constructor(String username, String Password, String email){
	 this.username=username;
	 this.Password=Password;
	 this.email=email;
	// display();
	
	 
 }

void setuser(String u, String p , String e) {
	username=u;
	Password=p;
	email=e;
}
void display() {
 	System.out.print(username+"\t");
	System.out.print(Password);
	System.out.println(email);
}
	static String Company;	
	int id ;
	String Name;
	Double salary;
	int Pass;
	
	void show() {
		System.out.println("Comapny Name:"+Company);
		System.out.println("Employee ID:"+id);
		System.out.println("Employee Name:"+Name);
		System.out.println("Employee Pass:"+Pass);
		System.out.println("======================================================================");
		
	}
	
public static void main(String[] args) {
	new constructor("sameer ","sam@7245","email@.com");
	new constructor("ahire", "Sameer@123","@gmail.com");
	constructor.Company="Google";
     constructor c1=new constructor();
     c1.id=1;
     c1.Name="Sameer Ahire";
     c1.Pass=7245;
     c1.salary=1800.00;
     c1.show();
     constructor c2=new constructor();
     c2.id=2;
     c2.Name="Sam Bhau Ahire";
     c2.Pass=1627;
     c2.salary=27000.00;
     c2.show();

}
}