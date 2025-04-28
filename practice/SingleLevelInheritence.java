package practice;
class Inheritence
{
	void Login_email()
	{
		System.out.println("Emailid");
	}
	void reg()
	{
		System.out.println("Registration");
	}
}
public class SingleLevelInheritence extends Inheritence
{
	static void Login_mobile()
	{
		System.out.println("Mobile");
	}
   public static void main(String[] args)
   { 
	   Login_mobile();
	   SingleLevelInheritence s1=new SingleLevelInheritence();
	     s1.reg();
	     s1.Login_email();
	}

}
