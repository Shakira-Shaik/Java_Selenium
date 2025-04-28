package practiceJavaPrograms;

public class CharAt_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1="Padma";
         /*   char c1= s1.charAt(0);
            System.out.println(c1);
            char c2= s1.charAt(1);
            System.out.println(c2);
            char c3= s1.charAt(2);
            System.out.println(c3);
            char c4= s1.charAt(3);
            System.out.println(c4);
            char c5= s1.charAt(4);
            System.out.println(c5); */
    //instead of doing this we can use for loop to iterate the elements
         for(int i=0; i<s1.length();i++)
         {
        	 char c1=s1.charAt(i);   
        //	 System.out.println(c1);
        	 System.out.print(c1);
        }
      /*   for(int i=s1.length()-1;i>=0;i--) // this is reverse
         {
        	 char c1=s1.charAt(i);   
             //	 System.out.println(c1);
             	 System.out.print(c1);
         }*/
         
         }
	}

  //if you give index size is more than the given string length in the charAt() or substring() or any string function then you will get
// StringIndexOutOfBoundsException