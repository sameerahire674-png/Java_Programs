package Strings;
import java.util.*;
public class substring {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a new String:");
	String str=sc.nextLine();
//	String ch=str.substring(1, 5);//kutun-kut parynt print honyasathi(starting to ending)
//	System.out.println(ch);
//	
//	String ch2=str.substring(2);// from starting index
//	System.out.println(ch2);
//	
	for(int j=0;j<=3;j++) {
		for(int i=j+1;i<=4;i++) {
		String ch3=str.substring(j,i);
		System.out.println(ch3+" ");//a ab abc abcd b bc bcd c cd d
		}
	}
}
}
