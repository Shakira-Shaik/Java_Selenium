package practice;

import java.util.Arrays;

public class Arrays_equal
{
  public static void main(String args[])
  {
	  int A[]=new int[4];
	  A[0]=10;
	  A[1]=12; 
	  A[2]=14;
	  A[3]=16;                 
	  int B[]=new int[4];
	  B[0]=10;
	  B[1]=12;
	  B[2]=14;
	  B[3]=16;
	  
	boolean b1=  Arrays.equals(A, B);
	System.out.println(b1);
	if(b1==true)
	{
	System.out.println("Arrays are equal "); 
  }
	else
	{
		System.out.println("Arrays are not equal");
	}
}
}
