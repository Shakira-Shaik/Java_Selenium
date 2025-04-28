package practice;

import java.util.Arrays;

public class Alphabet_Numeric_Spaces {
   static int Count_Of_Alphabet=0;
   static int Count_Of_Numeric=0;
   static int Count_Of_Spaces=0;
   static int Special_characters;
	public static void main(String[] args) {
	 String S1="@JNTUK is no 1 university# ";
	 char c1[]=S1.toCharArray(); 
	 System.out.println(Arrays.toString(c1));
     for(int i=0;i<S1.length();i++)
     {
    	  boolean b1=Character.isAlphabetic(c1[i]);
           if (b1==true)
    	  {
    		  Count_Of_Alphabet++;
    	  }
     }
     System.out.println("The total no of alphabets are :"+Count_Of_Alphabet);
    	 
	 for(int i=0;i<S1.length();i++)
     {
    	  boolean b1=Character.isDigit(c1[i]); 
           if (b1==true)
    	  {
    		  Count_Of_Numeric++;
    	  }
     }
     System.out.println("The total no of digits are :"+Count_Of_Numeric); 
     for(int i=0;i<S1.length();i++)
     {
    	  boolean b1=Character.isSpaceChar(c1[i]);  
           if (b1==true)
    	  {
    		  Count_Of_Spaces++;
    	  }
     }
     System.out.println("The total no of spaces are :"+Count_Of_Spaces); 	
     Special_characters=S1.length()-(Count_Of_Alphabet+Count_Of_Numeric+Count_Of_Spaces);
     System.out.println("The total no of special characters are "+ Special_characters); 
	}

}
