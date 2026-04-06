package practice;
import java.util.*;
public class inheritancedemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The values you want to accpet from user:");
	int n=sc.nextInt();
	int arr[]=new int[n];
	int arr2[]=new int[n-1];
	System.out.println("please enterr the "+n+" values:");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.print("your entered values is:");
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
		
		
	}
	System.out.println("Enter the index no you want to new no delete:");
	int m=sc.nextInt();
//	System.out.println("Enter new value for an new index:");
//	int p=sc.nextInt();
	for(int i=0;i<arr.length;i++) {
		  if(i<m) {
			  arr2[i]=arr[i];
		  }else if(i==m) {
			continue;
		}else {
			arr2[i-1]=arr[i];
		}
	}
		System.out.println("your updated values is:");
		for(int i=0;i<n-1;i++) {
			System.out.println(arr2[i]);
		}


//	int[] b= new int[5];
//	b[0]=10;
//	b[1]=50;
//	b[2]=90;
//	b[3]=70;
//	b[4]=80;
//	for(int j=0;j<=b.length;j++) {
//	System.out.print(b[j]);
//	
//		//sum=sum+b[j];
//		System.out.print(b[0]+" ");
//		System.out.print(b[1]+" ");
//		System.out.print(b[2]+" ");
//		System.out.print(b[3]+" ");
//		System.out.print(b[4]+" ");
//		System.out.println("\n Enter the elements you want to search:");
//		int sum=sc.nextInt();
//		int search=-1;
//		if(b[j]==sum) {
//			search=j;
//			System.out.println("Searching Elements at: "+sum+" position No:"+search);
//		}else {
//			System.out.println("not Found..");
//		}
//	}
//		//System.out.println("the sum is :"+sum);
//
//	System.out.println("\n ======================New Array Is Declared===============================");
//	for(int i=0;i<a.length;i++) {
//	System.out.println(a[i]);
//	}
}
	
}