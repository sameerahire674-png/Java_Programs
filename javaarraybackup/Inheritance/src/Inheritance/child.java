package Inheritance;

public class child extends abstraction{
	
	public void student(int id, String name, String Location) {
		System.out.println("Your name is:"+name);
		System.out.println("Your Location is "+Location);
		if(id==10) {
		System.out.println("Yes this id is regular Student.."+id);
		}else {
			System.out.println("not regular Student.."+id);
		}
	}
	public static void main(String[] args) {
		child c1= new child();
		c1.student(8,"sameer","Pune");
		c1.studentdata();
	}

	}



