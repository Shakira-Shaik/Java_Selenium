package practice;

public class SIB_IIB_Constructor 
{
   static
   {
	   System.out.println("SIB");
   }
   static
   {
	   System.out.println("SIB1");
   }
   {
	   System.out.println("IIB"); 
   }
   {
	   System.out.println("IIB1"); 
   }
   SIB_IIB_Constructor()
   {
	   System.out.println("Constructor ");
   }
	public static void main(String[] args) 
	{
		new SIB_IIB_Constructor();
		new SIB_IIB_Constructor();

	}

}
