package nonaccess;
/*  Encapsulation is a another way of security purpose to create 
which is used user only needed essential information are display 
and other information are protect. it's totally depends on the getter and setter method .
Hidding the information or data behind the method. */
class student{
	private int age;
	private int roll;
	private String Name;
	
	public int getage() {
		return age;
	}
	public int getroll() {
		return roll;
	}
	public String getName() {
		return Name;
	}
	
	public void setage(int age) {
		this.age=age;
	}
	public void setroll(int roll) {
		this.roll=roll;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
}

//public class encapsulation {
//public static void main(String[] args) {
//	student s1=new student();
//	s1.setage(22);
//	s1.setroll(02);
//	s1.setName("Sameer");
//	
//	System.out.println(s1.getage());
//	System.out.println(s1.getroll());
//	System.out.println(s1.getName());
	
//}
//}
