package practice;

public class Assert_In_Java 
{
public static void main(String args[])
{
	String A="Shakira";
	assert A.length()==7; 
	System.out.println(" The length of the String is 7 ");
	int a=25;
	assert a<=20:("Sorry the condition is false");
	System.out.println("The value of a is  "+(a+10)); 
}
}
