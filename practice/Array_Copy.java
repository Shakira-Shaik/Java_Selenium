package practice;

import java.util.Arrays;

public class Array_Copy {

	public static void main(String[] args)
	{
		String S1[]=new String[3];
		S1[0]="Sita";
		S1[1]="Ram";
		S1[2]="Lakshman";
		String S2[]=new String[3];
		for(int i=0;i<S1.length;i++)
		{
			S2[i]=S1[i];
		}
		System.out.println("The copied array is "+Arrays.toString(S2));
	}

}
