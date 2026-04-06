package com.demojava;

import java.util.Arrays;

//import java.util.Scanner;

public class first {
	public static void main(String[] args) {
		
//String arr[]= {"sam","ahire","sam bhau","giri","pawar"};
//		int arr[]= new int[5];
//		arr[0]=5;
//		arr[1]=10;
//		arr[2]=20;
//		arr[3]=40;
//		arr[4]=82;
		
		
		
		
		//2D Array
//		int arr[][]=new int[3][3];
//		arr[0][0]=100;
//		arr[0][1]=200;
//		arr[0][2]=900;
//		arr[1][0]=300;
//		arr[1][1]=400;
//		arr[1][2]=750;
//		arr[2][0]=500;
//		arr[2][1]=600;
//		arr[2][2]=500;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		//simple way 
//		System.out.println("Simple way");
//for(String i=0; i<arr.length;i++) {
//System.out.println(arr[i]);
//}
///// For each loop way
//System.out.println("For each loop way");
//for(int i:arr) {
//	System.out.println(i);
//}
//
//// tostring uses way to print array
//System.out.println("tostring uses way to print array");
//System.out.println(Arrays.toString(arr));
		Secondclass sc=new Secondclass("Google","pune",7245);
		Secondclass sc1=new Secondclass("Microsoft","Pune",1627);
		 
		Secondclass secondclass[]= new Secondclass[2];
		secondclass[0]=sc;
		secondclass[1]=sc1;
		for(int i=0;i<secondclass.length;i++) {
			secondclass[i].displaycourse();
		}
		
}
}
