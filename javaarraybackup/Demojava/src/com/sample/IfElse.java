package com.sample;
import java.util.*;
public class IfElse {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Amount:");
	double price= sc.nextDouble();
	if(price>20000) {
		System.out.println("your discount is 20%");
		double discount=price*0.20;
		System.out.println("Your discount amount is:"+discount);
		double FinalAmount=price-discount;
		System.out.println("Your Final Payable Amount is:"+FinalAmount);
	}else if(price>15000 && price<20000) {
		System.out.println("your Dicount is 10%");
		double discount=price*0.20;
		System.out.println("Your discount amount is:"+discount);
		double FinalAmount=price-discount;
		System.out.println("Your Final Payable Amount is:"+FinalAmount);
	}else {
		System.out.println("NO Discount");
	}
	
}
}
