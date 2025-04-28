package practice;

public class SIB_IIB {

	static
	{
		System.out.println("Static Initialization block"); 
	}
	static int i; 
	{
		i=10;
		System.out.println(i);
		System.out.println("Instance intialization block"); // initialize instance variable or non staic variable
		//iib called when object of the class created 
		//iib can used to achieve some thing before doing anything in the constructor 
	}
	public static void main(String[] args) 
	{
		System.out.println("Main method");
		new  SIB_IIB();
     // we can not change the order of execution but we can the way that you want to print the output
		//order of execution is 
		/* SIB
		   Main method 
		   IIB
		   Constructor */
	  /* new SIB_IIB();
		System.out.println("Main method"); */
	}

}
