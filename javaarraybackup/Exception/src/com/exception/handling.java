package com.exception;

public class handling {
//		int a=10;
//		int b=2;
//		try {
//		System.out.println(a/b);
//	}catch(ArithmeticException i) {
//		System.out.println("No this condition is False..");
//	}
//		
//		int[] arr= {10,50,30,60,70};
//		try {
//		System.out.println(arr[2]);
//		}catch(ArrayIndexOutOfBoundsException i) {
//			System.out.println("this no is not present in an array");
//		}

	double balance;
	
	public handling() {   //constructor
		balance=5000;
		
	}
	public void withdraw(double amount) {
		if(amount<=0){
			throw new InvalidamounExeception("you can give amonut is invalid please Enter valid amount...");
		}
		if(amount <= balance) {
			balance = balance-amount;
			System.out.println("Withdraw Successful.. & your Account balance is remaining is"+balance);
		}else {
			// self creating exception using throw keyword //
			throw new InsufficientException(" Your Account Balance Is Invalid to an you give an amount..");
		}
	}
	
public static void main(String[] args) {
	handling h1=new handling();
	try {
	h1.withdraw(100);
	}catch(InsufficientException i) {
		System.out.println(i.getMessage());
	}catch(InvalidamounExeception i) {
	System.out.println(i.getMessage());
}		
}
}
