package sample;
import java.util.*;
public class inputfromuser {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//System.out.print("Enter number size of array:");
//	int n=sc.nextInt();
//	int arr[]=new int[n];
//	System.out.println("enter elements:"); 
//	for(int i=0;i<n;i++) {
//		arr[i]=sc.nextInt();
//	}
//		for(int i=0;i<n;i++) {
//			System.out.print("Your Array is:"+arr[i]+" ");
//		
//	}
		
//	int arr[]= {10,20,35,40,6,12};
//	for(int i=0;i<=arr.length;i++) {
//		if(arr[i]<35) {
//			System.out.println(i);
//		}
//	}
	System.out.print("Enter number size of array:");
	int n=sc.nextInt();
	int arr2[]=new int[n];
	for(int i=0;i<arr2.length;i++) {
		arr2[i]=sc.nextInt();
	}
	System.out.println("Array number is:");
	for(int i=0;i<arr2.length;i++) {
		System.out.print(arr2[i]+" ");
	}1
	for(int i=0;i<arr2.length;i++) {
		//System.out.println(arr2[i]+" ");
		if(arr2[i]<=35) {
			System.out.println("\n array index is "+i);
		}
	}
		
}
}
