package practice;

import java.util.Arrays;

public class Array_Reverse {

	public static void main(String[] args) {
		int Old[]=new int[3];
		Old[0]=12;
		Old[1]=15;
		Old[2]=20; 
	    int New[]=new int[3];
	    for(int i=0,j=New.length-1;i<Old.length;i++,j--)   
	    {
	     New[j]=Old[i];
		}
System.out.println("Reverse_Array is "+Arrays.toString(New));
   int given_no=12;
   for (int j=0;j<New.length;j++)
   {
   if(given_no==New[j])
   {
	   System.out.println("Part of array at index position "+j);
   }
   else
   {
	   System.out.println("Not part of array");
   }
   }
}
}