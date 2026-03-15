// STUDENT NAME:Jonathan Smith
// DATE: 3/15/2026

public class Main {
    public static void main(String[] args) {
/****** DECLARATION SECTION ******/
    int a, m, y, a1, m1, y1;
    int day, month, year, dayBirth, monthBirth, yearBirth;
    double jdnBirth, jdnToday, dayDiff; 
    double age;


    /****** INITIALIZATION SECTION ******/
    dayBirth = 26;
    monthBirth = 8;
    yearBirth = 1918;

    day = 2;
    month = 2;
    year = 2020;

    /****** CALCULATION & PROCESSING SECTION ******/
    // Calculate JDN for Birthday
    a = (14 - monthBirth) / 12;
    y = yearBirth + 4800 - a;
    m = monthBirth + (12 * a) - 3;
    jdnBirth = dayBirth + ((153 * m + 2) / 5) + (365 * y) + (y / 4) - (y / 100) + (y / 400) - 32045;

    // Calculate JDN for Today
    a1 = (14 - month) / 12;
    y1 = year + 4800 - a1;
    m1 = month + (12 * a1) - 3;
    jdnToday = day + ((153 * m1 + 2) / 5) + (365 * y1) + (y1 / 4) - (y1 / 100) + (y1 / 400) - 32045;

    dayDiff = jdnToday - jdnBirth;
    age = dayDiff / 365;

/****** OUTPUT SECTION ******/
System.out.println("\nJulian Day Number for today's date, 2/2/2020, is " + (int)jdnToday);
System.out.println("\nJulian Day Number for birthday, 8/26/1918, is " + (int)jdnBirth);
System.out.println("\nThe difference in days is " + (int)dayDiff + ", which makes you approximately " + (int)age + " years old!");
System.out.println();
    }
}