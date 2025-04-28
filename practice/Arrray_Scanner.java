package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Arrray_Scanner {

	public static void main(String[] args) {
	int rollno[]=new int[3];
	Scanner S1=new Scanner(System.in);
	for(int i=0;i<rollno.length;i++) 
	{
         rollno[i]= S1.nextInt();
	}
	System.out.println(Arrays.toString(rollno));
 S1.close(); 
}
}
