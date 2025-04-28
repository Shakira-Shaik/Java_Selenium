package practice;

public class ConstructorOverloding
{
	 ConstructorOverloding()
	 {
		 this(12);
		 System.out.println("Non para"); 
	 }
	 ConstructorOverloding(int a)
	 {
		 System.out.println("para"); 
	 }
	public static void main(String[] args) 
	{
	  new  ConstructorOverloding();
	//   new  ConstructorOverloding(12); // instead of creating another object we can use this()

	}

}
