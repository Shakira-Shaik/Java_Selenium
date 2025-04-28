package practice;

public class StringFunctions {

	public static void main(String[] args)
	{
	   String S1= "Shakira";
	   String S2=new String (" Ghouse Basha "); 
	   String S3="shakira";
	   System.out.println(S1.length());
	   System.out.println(S1.toLowerCase());
	   System.out.println(S1.toUpperCase());  
	   System.out.println(S1.charAt(2));
	   System.out.println(S1.indexOf('k'));
	   System.out.println(S2.trim());
	     boolean b= S2.equals(S1);
	   System.out.println(b); 
	   System.out.println(S1.concat(" Shaik")); 
	   System.out.println(S1.equalsIgnoreCase(S3)); 
	   System.out.println(S2.substring(8));
	   System.out.println(S2.substring(1, 7)); 
	   System.out.println(S2.contains("Basha"));
	   //matches
	   System.out.println(S1.matches("S(.*)"));
	   System.out.println(S1.matches("(.*)a"));  
	   System.out.println(S1.matches("(.*)l(.*)")); 
	   System.out.println(S1.matches("...."));  
	   System.out.println(S1.endsWith("m")); 
	   System.out.println(S1.isEmpty());
	   System.out.println(S2.replace("G","g")); 
	   System.out.println(S2.replaceAll(" ", ""));
	    }  

}
