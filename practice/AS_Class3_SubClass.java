package practice;

import accessSpecifiers.AS_Class_First;

public class AS_Class3_SubClass extends  AS_Class_First 
{ 
public static void main(String[] args) 
{
	AS_Class3_SubClass a3=new AS_Class3_SubClass();
		
           a3.method2();
           a3.method3();
     //we can't access/call the private and package/default methods outside the package with relation(subclass)      
	}

}
