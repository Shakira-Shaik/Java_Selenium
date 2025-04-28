package practice;

import accessSpecifiers.AS_Class_First;

public class AS_Class4_withoutSubclass //without becoming the subclass :no relation
{
public static void main (String args[])
{
	// AS_Class4_withoutSubclass a4=new  AS_Class4_withoutSubclass(); 
	// we can call only sub  class  methods by creating an object of the sub class (no relation)
	// so we need to create an object of the class which has methods and we can access ony public methods 
	//outside the package without becoming the sub class
	AS_Class_First a4=new AS_Class_First();
			a4.method2(); //public method
	
}
}
