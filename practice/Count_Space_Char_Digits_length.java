package practice;

import java.util.Arrays;

public class Count_Space_Char_Digits_length {
    static int Count_of_characters=0;
    static int Count_of_Digits=0;
    static int Count_of_Space=0; 
    static int Special_Characters;
	public static void main(String[] args) 
	{
	   String S1= "Shakira is #1 student of her class";
	   int len =S1.length();
	   System.out.println("The length of the String is "+len);
	   char c1[]=S1.toCharArray();
	   System.out.println(Arrays.toString(c1)); 
	   for(int i=0;i<S1.length();i++)
	   {
		  boolean b1= Character.isAlphabetic(c1[i]);
		  if(b1==true)
		  {
			  Count_of_characters++;
		  }
	   }
	   System.out.println("The total no of characters are "+ Count_of_characters);
	   for(int i=0;i<S1.length();i++)
	   {
		  boolean b1= Character.isDigit(c1[i]); 
		  if(b1==true)
		  {
			  Count_of_Digits++; 
		  }
	   }
	   System.out.println("The total no of Digits are "+ Count_of_Digits);
	   for(int i=0;i<S1.length();i++)
	   {
		  boolean b1= Character.isSpaceChar(c1[i]);   
		  if(b1==true)
		  {
			  Count_of_Space++; 
		  }
	   }
	   System.out.println("The total no of Spaces are "+ Count_of_Space);
	   Special_Characters=len-(Count_of_characters+Count_of_Digits+ Count_of_Space);
	  System.out.println("The total no of special characters are "+ Special_Characters ); 
	}

}
