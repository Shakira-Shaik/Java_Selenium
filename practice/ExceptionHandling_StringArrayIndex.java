package practice;

import java.util.Scanner;

public class ExceptionHandling_StringArrayIndex {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter your name ");
		String name =s1.next();
		System.out.println("enter the index value");
		try {
		int i=s1.nextInt();
		char c= name.charAt(i); 
	System.out.println("The character of a string at the index position is "+c); 
		}
		catch(StringIndexOutOfBoundsException a)
		{
			System.out.println("Handled the exception");
		}
		finally
		{
			s1.close();
		}
	}

}
