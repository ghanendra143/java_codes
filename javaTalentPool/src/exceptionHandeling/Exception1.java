package exceptionHandeling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("start..");
		try {
			System.out.print("enter num1 : ");
			int a = sc.nextInt();
			System.out.print("enter num2 : ");
			int b = sc.nextInt();
			float c = (float)a/b;    // type casting  int to float
			System.out.println("result : " + c);
			if(c<=1) {
				throw new myException();  // my custom exception handling
			}
		} catch (ArithmeticException e) {
			System.out.println("0 can't divide");
			System.out.println(e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("please enter integers only");
			System.out.println(e.getMessage());
		}
		catch (myException e) {
			System.out.println("use bigger num1");
		}
		catch (Exception e) {
			System.out.println("invalid number");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("run in any condition");
		}
		System.out.println("end..");
	}

}
