package practice;

import java.util.Scanner;

public class ReverseString_In_NonStaticMethod 
{
    void method() 
    {
    	Scanner s1=new Scanner(System.in);
    	String name=s1.next();
    	String reverse="";
    	for(int i=name.length()-1;i>=0;i--)
    	{
    		char c1=name.charAt(i);
    		reverse=reverse+c1;
    	}
    	System.out.println("The reverse string is "+reverse);
    	 s1.close();	
    }
  public static void main(String[] args) 
	{
		ReverseString_In_NonStaticMethod r1=new ReverseString_In_NonStaticMethod ();
                r1.method();
	}
	}
