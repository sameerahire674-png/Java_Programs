package method;

public class method1 {
void add(int a, int b) {
	int c=a+b;
	System.out.println("Addtion is :"+c);
}
void add() {
	
	System.out.println("Addtion is :"+10+20);
}
public static void main(String[] args) {
	method1 m1=new method1();
	m1.add(10,20);
	
}
}
