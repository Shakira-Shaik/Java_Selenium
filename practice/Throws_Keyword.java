package practice;

public class Throws_Keyword {

	public static void main(String[] args) throws NullPointerException, InterruptedException 
	{
		Thread.sleep(2000);
	   throw new NullPointerException();
   //throws keyword used to declare the exception and also it can declare many no of exceptions
	}

}
