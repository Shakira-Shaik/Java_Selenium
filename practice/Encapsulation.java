package practice;
class program 
{
	private String username ="gtm.com";
	private String password="Abc@123";
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
}
public class Encapsulation {

	public static void main(String[] args) 
	{
        program p1=new program();
        p1.setUsername("ghose407@gmail.com");
        System.out.println("user name is "+p1.getUsername());
        p1.setPassword("ghose407");
        System.out.println("password is "+p1.getPassword()); 
	}

}
