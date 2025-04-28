package practice;

import java.util.Date;

public class EpocheTimeConverter {

	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println("Epoche time is " + d1.getTime()); 
		Date d2=new Date(d1.getTime()); //converting epochetime to human understandable time 
		System.out.println(d2); 
		String time =d2.toString(); //to apply string functions 
		String month =time.substring(4, 7);
		System.out.println(month);
        String date=time.substring(8, 10);
        System.out.println(date); 
        String year=time.substring(time.length()-4);
        System.out.println(year); 
        String actualtime=time.substring(11, 19);
        String actime=actualtime.replace(":", "-");
        System.out.println(actime);
        String date_format=date.concat(month).concat(year).concat(actime); 
        System.out.println( date_format);
        String date_format1=date.concat(" ").concat(month).concat(" ").concat(year);  
        System.out.println( date_format1);
		
	}

}
