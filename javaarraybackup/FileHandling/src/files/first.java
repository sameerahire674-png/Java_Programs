package files;
import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*what is file handling-> To Store data permanantly we can use file hasndling concept
 * what is file-> file is used to store the any type of data i.e ex, txt, pdf , video, png jpg, img,docs,xlxs.
 *  */
public class first {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter informaton you want to insert an file:");
	String data=sc.nextLine();
	for(int i=2;i<=10;i++) {
		for(int j=1;j<=10;j++) {
			System.out.println(i+"*"+j+" = "+i*j+"\t");
		}
		
	}
	try {
	File file=new File("C:\\Users\\Sameer\\Downloads\\samjava.txt");
	file.createNewFile();//This method is used to created a new file & also you want to any one type extension.
	FileWriter writer=new FileWriter(file);	
	FileReader fr = new FileReader(file);
//	for(int i=2;i<=10;i++) {
//		for(int j=1;j<=10;j++) {
//			writer.write(i*j+"\t");
//		}
//	}
	System.out.println();
	writer.write(data);// This method is used to created file to store some information .
	writer.close();
	fr.read(data);
	fr.close();
	}catch(IOException e) {
		e.printStackTrace();
	}
	System.out.println("file Created & Data Written successfully...");
	sc.close();
}
}
