package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Numbers_Print_each_line  
{
	public static void main(String[]args)
	{
   int marks[]=new int[4];
   Scanner s1=new Scanner(System.in);
   for (int i=0;i<marks.length;i++)
   {
	    marks[i] = s1.nextInt(); 
	  
	 }
  System.out.println("The array of numbers are "+Arrays.toString(marks)); 
  System.out.println("The array of numbers in each line are ");
   for (int i=0;i<marks.length;i++)
   {
	System.out.println(marks[i]);
	  
	 }
   s1.close();
	}
}