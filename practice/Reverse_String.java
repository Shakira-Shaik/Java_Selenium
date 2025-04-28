package practice;

public class Reverse_String {

	public static void main(String[] args) 
	{
	    String S1="Shakira";
	    String S2="";
	    for(int i=S1.length()-1;i>=0;i--)
	    {
	    	char c1=S1.charAt(i);
	    	S2=S2+c1;
	    }
   System.out.println("Reverse String is "+S2);
	}

}
