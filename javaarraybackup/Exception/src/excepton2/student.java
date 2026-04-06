package excepton2;
import java.util.*;
public class student {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the divded1 number:");
        int b = sc.nextInt();
        int arr[] = new int[5];
        int result;
        try {
        	if(b==0) {
        		throw new InvalidLimitedException("Your input is invalid. Cannot divide by zero.");
        	}
            result = a / b;
            System.out.println("Your result is: " + result);
            try {
            	if(arr[6]==40) {
                	throw new InvalidNumberException("Your array size is only 5 integers... Please Correct Input number..");
                }
            	arr[4]=40;
            	System.out.println("Array assignment Inserted successful.");
            	
            }catch (InvalidNumberException i) {
                System.out.println(i.getMessage());
            }
            }catch (InvalidLimitedException e) {
               	System.out.println(e.getMessage());
        }finally {
         System.out.println("your Program will be excute.. ");
            }
    }
}
