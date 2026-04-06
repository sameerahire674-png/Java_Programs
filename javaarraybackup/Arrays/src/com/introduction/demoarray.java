package com.introduction;
import java.util.*;
public class demoarray {

//		                            1D array decleration
	void show() {
		int sum=0;
		int ages[]={10,20,50,60,80};
		String name2[]= {"Sam","Bhau","guru"};
		for(int i=0;i<ages.length;i++) {
			sum=sum+ages[i];//sum of elements in an array
			System.out.println(ages[i]);
			System.out.println(sum);
		}
		for(int j=0;j<name2.length;j++) {
			System.out.print(name2[j]);
		}
		System.out.println(" ");
	}	
	
	// Maximum nuber in Array //
	void aary() {
		int a=0;
		int nums[]= {40,50,80,90,100,72,64};
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>a) {
			a=nums[i];
			System.out.print(nums[i]+" ");
			}
		}
		//System.out.println("\nThe Maximum Number In Array is:"+a);
	}
	
	
	// Searching Elements in array//
	void search() {
		int array[]= {40,50,80,90,100,72,64,40};
		int x=80;
		//int y=-1;
		 for (int i=0;i<array.length;i++) {
			 if(array[i]>x) {
				x= array[i];
				 System.out.println(i);
				// y=i;
				 
				
			 }
		 }
		// System.out.println("\n Your Number is "+ x +" at index of:"+y);	 
	}
	
	
	
	void arr2() {
		int[] student= new int[3];
		student[0]=50;
		student[1]=60;
		student[2]=70;
		
		for(int i=0;i<student.length;i++) {
			System.out.println(student[i]);
		}
	}
	
		
	void show2() {
			int sum=0;
		int arr[]=new int[5];
		String name[]=new String[3];
		float weight[]=new float[2];
		arr[0]=50;
		arr[1]=10;
		arr[2]=40;
		arr[3]=90;
		arr[4]=80;
		System.out.println("the value of arr is:"+arr.length);
		for(int i=0;i<=arr.length;i++) {
			sum=sum+arr[i];
		System.out.println("The sum of array is:"+sum);
			if(arr[0]==50) {
				System.out.println("The arr of value is:"+arr[i]);
			}else {
			System.out.println("Not Corect number:");
			}
			//System.out.println("The arr of value is:"+arr[i]);
		}
		name[0]="sameer";
		name[1]="Ahire";
		name[2]="giri";
		System.out.println("The number of arrary present in String:"+name.length);
		for(int i=0;i<name.length;i++) {
		System.out.println("the name of array is:"+name[i]);
		}	
//		//for each loop//
		for(String x:name) {
			System.out.println("the name of array is:"+x);		
		}
//				//While loop//
////		int i=0;
////		while(i<name.length) {
////			System.out.println(name[i]);
////			i++;
////		}
		
		
		weight[0]=80;
		weight[1]=90;
		for(int k=0;k<weight.length;k++) {
		System.out.println(weight[k]);
				}
	}
		
	//                                    2D Array Decleration
////		 
		void display() {
		int [][]arr_1  = new int[3][3];
		arr_1[0][0]=20;
		arr_1[0][1]=30;
		arr_1[0][2]=10;
		arr_1[1][0]=40;
		arr_1[1][1]=50;
		arr_1[1][2]=60;
		arr_1[2][0]=70;
		arr_1[2][1]=80;
		arr_1[2][2]=90;
		for(int i=0;i<arr_1.length;i++) {
			for(int j=0;j<arr_1.length;j++) {
			System.out.print(arr_1[i] [j] +"  ");

			System.out.println(arr_1.length);
		}
	}
		System.out.println();
		}
//		 //Another Way Decleration
		void display2() {
		int arr[][]= {{10,20,30},{40,50,60},{70,80,90}};
		System.out.println(arr[0][0]); 
		System.out.println(arr[0][1]); 
		System.out.println(arr[0][2]); 
		System.out.println(arr[1][0]); 
		System.out.println(arr[1][1]); 
		System.out.println(arr[1][2]); 
		System.out.println(arr[2][1]); 
		System.out.println(arr[2][1]); 
		System.out.println(arr[2][2]); 
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println( );
		
	}

		void darray(){
			int a[][]=new int[3][3];
			a[0][0]=2;
			a[0][1]=3;
			a[0][2]=4;
			a[1][0]=5;
			a[1][1]=6;
			a[1][2]=7;
			a[2][0]=10;
			a[2][1]=20;
			a[2][2]=30;
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a.length;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
		
		void multiplication() {
			//int n=5;
			for(int i=2;i<=10;i++) {
				for(int j=1;j<=10;j++) {
					System.out.println(i+"*"+j+" = "+i*j+"\t");
				}
				
			}
		}
		
		void array() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your NUmber you want to print in array:");
			int arr[]=new int[];
			
		}

public static void main(String[] args) {
	demoarray d1=new demoarray();
//   d1.display();
//	d1.display2();
//	d1.show();
	//d1.show2();
//	d1.aary();
	d1.search();
	//d1.arr2();
	//d1.darray();
	//d1.multiplication();
}
}
