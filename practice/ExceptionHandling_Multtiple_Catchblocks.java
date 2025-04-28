package practice;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling_Multtiple_Catchblocks 
{
  public static void main(String[] args) 
	{
	    Scanner s1=new Scanner(System.in);
	    System.out.println("Enter the array size");
	    try {
		int size= s1.nextInt();
	     int a[]=new int[size];
	     System.out.println("Enter the array values");   
	     for(int i=0;i<=size;i++) 
	     {
	    	 a[i]= s1.nextInt();
	     }
	     System.out.println("The array of numbers is "+Arrays.toString(a));
	    }
      catch(InputMismatchException I)
      {
    	  System.out.println("Please enter the size Properly:Handled");
      }
	   catch(ArrayIndexOutOfBoundsException a1)
	    {
		   System.out.println("Handled the Exception");
	    }
	    finally
	    {
	    	s1.close();
	    }
	}

}
