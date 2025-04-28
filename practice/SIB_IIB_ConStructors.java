package practice;
 class A
{
	static 
	{
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}
	{
		System.out.println("IIB2");
	}
	A(int a) 
	{
		System.out.println("Parent class Constructor");
	}
}
public class SIB_IIB_ConStructors extends  A
{
	static 
	{
		System.out.println("SIB 1");
	}
	{
		System.out.println("IIB 1");
	}
	SIB_IIB_ConStructors()
	{ 
		super(10);
		System.out.println("Child class constructor");
	}
public static void main(String[] args) 
{
	System.out.println("Main method"); 
		new SIB_IIB_ConStructors(); 
 
	}

}
