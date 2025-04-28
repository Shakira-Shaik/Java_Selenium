package practice;

public class StringIndex_OutOfBound_Exception 
{
	public static void main(String args[])
	{
   String A1="Sanjia";
   char c1=A1.charAt(6);
   System.out.println(c1);  
   System.out.println(A1.substring(4));
   System.out.println(A1.indexOf('b')); 
   
  //if you give more than index size in any String function then you get String out of bound Exception 
}
}
