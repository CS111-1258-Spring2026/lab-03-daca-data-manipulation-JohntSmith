// STUDENT NAME:Jonathan Smith
// DATE: 2/11/2026

public class Main 
{
  public static void main(String[] args) 
	{

		/***** DECLARATION SECTION *****/
		int a, m, y, a1, m1, y1;
		double jdnBirth, jdnToday;
		int day, month, year,dayBirth, monthBirth, yearBirth;
		double dayDiff,age;

		/***** INITIALIZATION SECTION *****/
		



		/***** INPUT SECTION *****/
		// N/A (no input for this lab)
		
		
		
		
		/***** CALCULATION & PROCESSING SECTION *****/
		// 1. Calculation for Birthdate.
		dayBirth = 26;
		monthBirth = 8;
		yearBirth = 1918;

		a = (14 - monthBirth) / 12;
		y = yearBirth + 4800 - a;
		m = monthBirth + (12 * a) - 3;
		jdnBirth = dayBirth + ((153 * m + 2) / 5) + (365 * y) + (y / 4) - (y / 100) + (y / 400) - 32045;

		// 2. Calculation for Today.
		day = 2;
		month = 2;
		year = 2020;

		a1 = (14 - 2) / 12;
		y1 = year + 4800 - a1;
		m1 = month + (12 * a1) - 3;
		jdnToday = day + ((153 * m1 + 2) / 5) + (365 * y1) + (y1 / 4) - (y1 / 100) + (y1 / 400) - 32045;

	
		dayDiff = jdnToday - jdnBirth;
		age = dayDiff / 365;
		
		
		/***** OUTPUT SECTION *****/
		System.out.println( "Julian Day Number for today's date, 2/2/2020, is " + (int) jdnToday);
		System.out.println( "Julian Day Number for birthday, 8/26/1918, is " + (int)jdnBirth);
		System.out.print( "The difference in days is " + (int) (jdnToday - jdnBirth));
		System.out.print( ", which makes you approximately " + (int) age);
		System.out.println(" years old!");
  }
}