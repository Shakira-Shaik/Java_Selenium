package practice;

public class Array_Average {

	public static void main(String[] args) 
	{
		int Marks[]=new int[3];
		Marks[0]=50;
		Marks[1]=35;
		Marks[2]=25;
		double sum=0;
		for(int i=0;i<Marks.length;i++)
		{
			sum=sum+Marks[i];
		}
		System.out.println("The total sum is "+sum);
		double Avg=sum/3;
		System.out.println("The Average is "+Avg); 
	}

}
