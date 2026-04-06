package com.exception;
import java.util.*;

          //  Accept the value in array and there operations   //
public class demoarray2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n=sc.nextInt();
		int[] arr= new int[n];
		System.out.println("your Array elements Size is: "+n);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
		System.out.print("your Array elements is:"+arr[i]);
        //System.out.println(arr[i]);
		}
	}

}
