package Inheritance;
public class Firstclass {

//
//	double balance;
// 
// void display(double amount) {
//	if(amount>0) {
//		balance=balance+amount;
//		System.out.println("Your Amount is added.."+balance);
//		System.out.println("Your fianl Amount is:"+balance);
//	}
// }
	int id;
    String name;
    int pass;
    int mobo;
    String email;
    double salary;
    String role;
    Secondclass secondclass;


	public Firstclass(int id, String name, int pass, int mobo, String email, double salary, String role,Secondclass secondclass) {
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.mobo = mobo;
		this.email = email;
		this.salary = salary;
		this.role = role;
		this.secondclass = secondclass;
	}
	
void dispaly() {
	System.out.println("student id       :"+id);
	System.out.println("student Name     :"+name);
	System.out.println("Student Password :"+pass);
	System.out.println("Student Mobile No:"+mobo);
	System.out.println("Student Email    :"+email);
	System.out.println("Student salary   :"+salary);
	System.out.println("Student Role     :"+role);
	//System.out.println("Student Company name:"+secondclass);
	secondclass.displaycourse();
	System.out.println("========================================================================");
}
	public static void main(String[] args) {
	    Secondclass sc1= new Secondclass("Google","Pune",7245);
		Secondclass sc2= new Secondclass("Microsoft","benglore",1004);
		Firstclass fc1= new Firstclass(1627,"Sameer",2004,9623,"sameer@gmail.com",100000.00,"Software Developer",sc1);
		fc1.dispaly();
		Firstclass fc2= new Firstclass(1234,"Sam Bhau",2005,9623,"sam@gmail.com",100000.00,"Software Developer",sc2);
		fc2.dispaly();
	}
}