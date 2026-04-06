package com.introduction;
import java.util.*;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class demo {
public static void main(String[] args) {
//	int arr[]={10,20,30,40,50};
//	int avg = 0;
//	for(int i=0;i<arr.length;i++) {
//		avg+=arr[i];
//		System.out.println(avg);
//	}

File file=new File("C:\\Users\\Sameer\\Desktop\\sam.txt");
//FileWrite fw= new FileWrite("C:\\\\Users\\\\Sameer\\\\Desktop\\\\sam.txt");

try {
      FileWriter fw= new FileWriter("C:\\Users\\Sameer\\Desktop\\sam.txt",true);
	file.createNewFile();
	//fw.write("Hello I'm sameer Ahire From Nashik...");
	fw.write("And i am learning the Java programming language...");
	fw.write("And i am also learning the Python programming language...");
	fw.flush();
	System.out.println("Data Inserted Successfully...");
}catch(IOException e) {
		e.printStackTrace();
	}
System.out.println("File Created Successfully....");

}
}
