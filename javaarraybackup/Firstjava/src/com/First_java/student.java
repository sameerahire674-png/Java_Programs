package com.First_java;

import java.util.Scanner;

public class student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter you want no:");
		int n = sc.nextInt();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==4 || j==3) {
					System.out.print("$");
				}else {
					System.out.print(i );
				}
				
			}
			System.out.println();
		}
		
	}

}
