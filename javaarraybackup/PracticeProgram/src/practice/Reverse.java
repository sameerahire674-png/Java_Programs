package practice;
import java.util.*;
public class Reverse {
	public static void main(String[] args) {	
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbeer:");
int num=sc.nextInt();
int rev=0;
while(num>0)
{
	rev=rev*10+num%10;
	num=num/10;
	System.out.println(rev);
}





//Print the character 
//int n=26;
//char ch='A';
//System.out.println(ch);
//for(int i=1;i<='Z';i++) {
	for(char ch='A';ch<='z';ch++) {
	System.out.println(ch);
	//ch++;
}
System.out.println();
}
}
