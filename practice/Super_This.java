package practice;
class Super
{
	Super()
	{
		System.out.println("NP");
	}
	void add()
	{
		System.out.println("A");
	}
}
public class Super_This extends Super
{
	
	void add()
	{
		super.add();
		System.out.println("B");
	}
	Super_This ()
	{
		this(5);
		System.out.println("P");
	}
	Super_This(int a)
	{
		super();
		System.out.println("N");
	}
	public static void main(String args[])
	{
		new Super_This();
	
	}
}
