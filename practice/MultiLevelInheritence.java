package practice;
class LoginM
{
	static void login_mobile()
	{
		System.out.println("Login with mobile"); 
	}
}
class LoginE extends LoginM 
{
	void login()
	{
		System.out.println("Login with emailid");
	}
}
public class MultiLevelInheritence extends LoginE
{
	static void logout()
	{
		System.out.println("Logout");
	}
	public static void main(String[] args) 
	{
		MultiLevelInheritence m1= new MultiLevelInheritence();
		m1.login();
		login_mobile();
		logout();

	}

}
