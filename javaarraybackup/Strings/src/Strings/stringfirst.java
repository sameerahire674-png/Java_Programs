package Strings;
import java.util.*;
public class stringfirst {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a new sting:");
	String str=sc.nextLine();
//	System.out.println("the string length is :"+str.length());
//	char ind=str.charAt(8);
//	System.out.println("the character present is :"+ind);
//	int index=str.indexOf('r');
//	System.out.println("the r is present in the index of :"+index);

	
//	System.out.println("the given input is present character matched or not:"+str.contains("s"));
//	 System.out.println(str.toUpperCase());
	 
	 
//	 System.out.println("enter a second string:");
//	  String str2=sc.nextLine();
//	  
//	  String ch = str.concat(str2);
//	  System.out.println("the join of the two string is:"+ch);
//	  ch=ch+"T&P Co-ordinator";
//	  System.out.println(ch);
	  
//	  str=str+10+20;//starting from first that means not to add the elements,
//	                    //but the number you write first then we adding the elements and shows the output 30str
//	  System.out.println(str);
//	  
	 String rev="0";
	 int len=str.length();
	 for(int i=len-1;i>=0;i--) {
		 rev=rev+str.charAt(i);
		 System.out.println(rev);
	 }
	
}
}
