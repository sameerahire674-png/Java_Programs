package com.sample;

import java.util.Scanner;

public class BankingApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int savingmoney = 50000;
		System.out.println("Our Saving Amount is 50000/");
		System.out.println("Enter you want how many money:");
		int money=sc.nextInt();
//		if(savingmoney > money) {
//			System.out.println("your amount is sufficient..!");
			System.out.print("Enter your pin:");
			int pin=sc.nextInt();
			if(pin==7245) {
				System.out.println("Your pin is Correct..!");
				if(savingmoney<=money) {
					money-=savingmoney;
					System.out.println("Yes Your Transaction is Successfull...!");
				}
				}else {
					System.out.println("your pin is Incorret");
			}
//		}else {
//			System.out.println("please check you account balance please..!");
//		}
//		

	}
}
