package practice;

public class ExceptionHandling_Arthmetic {

	public static void main(String[] args) 
	{ 
	 try {
		int i=1/0;  // exception 
		int j=i++;
		System.out.println("The value is "+ j);
	 }
	catch(ArithmeticException a)
	 {
		System.out.println("Handled the exception ");
	 }
	}

}
