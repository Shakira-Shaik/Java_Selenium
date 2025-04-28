package practice;
class Parent
{
	void add(int a)
	{
		System.out.println("addition");
	}
}
public class MethodOverriding extends Parent 
{ 
	void add(int a)
	{
		super.add(5);
		System.out.println("addition method"); 
		
	}
   public static void main(String[] args) 
   {
	   MethodOverriding m1=new MethodOverriding();
	   m1.add(10);

	}

}
