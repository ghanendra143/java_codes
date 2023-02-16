package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExercise {

	public static void main(String[] args) {
		System.out.println("enter your details below :");
		Scanner sc = new Scanner(System.in);
		System.out.print("1. Enter your name : ");
		String name = sc.nextLine();
		
		System.out.print("2. Enter your age : ");
		int age = sc.nextInt();
		
		System.out.print("3. Enter your designation : ");
		String des = sc.next();
		
		System.out.print("4. Enter your salary : ");
		int sal = sc.nextInt();
		
		System.out.print("press 1 to save details in a file: ");
		int choice = sc.nextInt();
		if(choice==1) 
		{
			try
			{
				FileWriter fr = new FileWriter("demo2.txt");
				fr.write("Name = "+name+"\n"+"Age = "+age+"\n"+"Designation = "+
				des+"\n"+"Salary = "+sal);
				fr.close();
				System.out.println("wrote successfully in the file");
			}
			catch(IOException e)
			{
				System.out.println("unaable to write");
				System.out.println(e.getMessage());
			}
		}
		else
		{
			System.out.println("invalid choice");
		}

		System.out.print("press 2 to view file details : ");
		int sel = sc.nextInt();
		if(sel==2)
		{
			try
			{
				File read = new File("demo2.txt");
				Scanner fileInfo = new Scanner(read);
				while(fileInfo.hasNext())
				{
					String data = fileInfo.nextLine();
					System.out.println(data);
				}
			}catch(IOException e)
			{
				System.out.println("an error occured");
				System.out.println(e.getMessage());
			}
		}
		else
		{
			System.out.println("invalid selection");
		}
	
	}
}
