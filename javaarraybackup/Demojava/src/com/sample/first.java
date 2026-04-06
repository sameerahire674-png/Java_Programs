package com.sample;
import java.util.*;
public class first {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your no you want print:");
		int n=sc.nextInt();
		int sum=0;
		while(n>0) {
			sum=sum+n%10;
			n=n/10;
			System.out.println("The final answer is :"+sum);
		}
	}
	
}
