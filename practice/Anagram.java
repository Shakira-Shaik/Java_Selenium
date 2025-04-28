package practice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
		String s1="thing";
		String s2="night";
		if (s1.length()!=s2.length())
		{
			System.out.println("They are not anagram");
		}
		else
		{
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2))
			{
				System.out.println("Anagram of each other");
			}
			else
			{
				System.out.println("Two Strings are not anagram of each other");
			}
		}

	}

}
