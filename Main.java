// STUDENT NAME:Jonathan Smith
// DATE: 2/11/2026

public class Main 
{
  public static void main(String[] args) 
	{

		/***** DECLARATION SECTION *****/
		double a;
		double m;
		double y;
		double jdn;
		int day;
		int month;
		int year;
		int dayBirth;
		int monthBirth;
		int yearBirth;
		


		/***** INITIALIZATION SECTION *****/
		



		/***** INPUT SECTION *****/
		// N/A (no input for this lab)
		
		
		
		
		/***** CALCULATION & PROCESSING SECTION *****/
		dayBirth = 26;
		monthBirth = 8;
		yearBirth = 1918;

		year = 1918;
		month = 8;
		day = 26;

		a = (14 - month) /12;
		y = year + 4800 - a;
		m = month + (12*a) - 3;
	



		jdn = day + ((153 * m + 2) / 5) + (365 * y) + (y / 4) + (y / 100) + (y / 400) - 32045;
		
		
		
		
		/***** OUTPUT SECTION *****/
		System.out.println( "Julian Day Number for today's date, 2/2/2020, is  ");
		System.out.println( "Julian Day Number for birthday, 8/26/1918, is " + jdn);
		System.out.print( "The difference in days is ");
		System.out.print( "which makes you approximately ");
		System.out.println("years old!");
  }
}