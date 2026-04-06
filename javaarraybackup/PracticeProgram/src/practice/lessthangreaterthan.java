package practice;
import java.util.*;
public class lessthangreaterthan {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	System.out.println("X="+x);
	System.out.println("Y="+y);
	if(x<y) 
		System.out.println("Y is greater than X");
	x=x*2;
	if(x==y)
	System.out.println("X now equal to y:"+x);
	x=x*2;
	if(x==y)
		System.out.println("You want to seee this"+x);
}
}
