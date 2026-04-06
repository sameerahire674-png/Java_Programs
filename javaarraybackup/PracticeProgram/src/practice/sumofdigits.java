package practice;
import java.util.*;
public class sumofdigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter Number You want to Sum:");
		int n=sc.nextInt();
		int sumofDigits=1;
		int originalnum=n;
		for (int i=0;i<=n;i++) {
			sumofDigits=sumofDigits+n%10;
			n=n/10;
		}
		System.out.println("The Sum of Digits of all gidits is:"+originalnum+" = "+sumofDigits);
	}

}
