package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Scanner {

	public static void main(String[] args) 
	{
	    int Empno[]=new int[4];
	    Scanner s1=new Scanner(System.in);
	    for(int i=0;i<Empno.length;i++)
	    {
	    	Empno[i]=s1.nextInt();
	    }
	    	System.out.println(Arrays.toString(Empno));  
	   
     s1.close();
	}

}
