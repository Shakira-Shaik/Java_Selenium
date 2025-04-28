package practice;

import java.util.Arrays;

public class Array_create 
{  
	public static void main(String args[])
	{
    int rollno[]=new int[4];
    rollno[0]=10;
    rollno[1]=15;
    rollno[2]=20;
    rollno[3]=25;
   System.out.println(Arrays.toString(rollno)); 
   String Name[]=new String[4];
   Name[0]="ravi";
   Name[1]="sita";
   Name[2]="mahi";
   Name[3]="nick";
   System.out.println(Arrays.toString(Name));
}
}
// if you give more than the index size then you will get ArrayIndexOutOfBounds Exception 
//if you give less than the index size then it takes the default values 
//int:0,float,double:0.0 String:null 