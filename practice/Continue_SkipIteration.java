package practice;

public class Continue_SkipIteration {

	public static void main(String[] args) 
	{
	  for(int i=0;i<=4;i++)
	  {
		  if(i==2)
		  {
			  continue; //skip the iteration at index 2 
		  }
		  System.out.println(i);  
	  }

	}

}
