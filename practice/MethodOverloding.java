package practice;

public class MethodOverloding {

	static  void Login()
	{
		System.out.println("Login with email"); 
	}
	static void Login(String a)  
	{
		System.out.println("Login with mobile");
	}
	void sub()
	{
		System.out.println("Subtaction");
	}
	void sub(int a)
	{
		System.out.println("Subtraction1");
	}
	public static void main(String[] args) 
	{
		Login();
		Login("mobile");
		MethodOverloding m1=new MethodOverloding();
		   m1.sub();
		   m1.sub(5);

	}

}
