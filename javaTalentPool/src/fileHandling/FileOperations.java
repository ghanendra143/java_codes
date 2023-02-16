package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {
	public static void main(String[] args){
		// ================= file handling =====================
		
		// ================== 1. create file ========================
//		try
//		{
//			File myfile = new File("demo.txt");
//			if(myfile.createNewFile()) {
//				System.out.println("new file created named: "+myfile.getName());
//			}
//			else
//			{
//				System.out.println("file already exist named: " +myfile.getName());
//				System.out.println("path : " + myfile.getAbsolutePath());
//			}
//		}catch(IOException e)
//		{
//			System.out.println("an error occured");
//		}
		
		// =================== 2. write in file ==============================
//		try
//		{
//			FileWriter fr = new FileWriter("demo.txt");
//			fr.write("java is good language. \nmy profile is java backend developer"
//					+ " \nI like it VERY MUCH THANKYOU");
//			fr.close();
//			System.out.println("write successfully in file");
//		}catch(IOException e)
//		{
//			System.out.println("unable to write");
//		}
		
		// =================== 3. Read file ===============================
		try
		{
//			File obj = new File("demo.txt");
//			Scanner read = new Scanner(obj);
//			while(read.hasNextLine())
//			{
//				String data = read.nextLine();
//				System.out.println(data);
//			}
			FileReader fr = new FileReader("demo.txt");
			char[] a = new char[100];
			fr.read(a);   // reads the content to the array
			for(char c : a)
			{
				System.out.print(c);   // prints the characters one by one
			}
	      fr.close();
			
		}catch(IOException e) 
		{
			System.out.println("an error occured");
		}
		
		// ================== 4. Delete File ===================================
//		File file = new File("demo.txt");
//		if(file.delete())
//		{
//			System.out.println(file.getName() + " file deleted");
//		}
//		else
//		{
//			System.out.println("can't delete file");
//		}
	}
}
