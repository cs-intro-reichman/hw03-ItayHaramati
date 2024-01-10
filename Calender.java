/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calender {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
		public static void main(String args[]) {
			int yearChoose = 2021;
			int yearLater = yearChoose + 1;
			 while (year < yearChoose) {
				advance();
				year++;
			 }
		
			 while (yearChoose < yearLater) {
				for (int x = 1; x <= 12; x++) {
					for (int y = 1; y <= nDaysInMonth(x, yearChoose); y++) {
						if (dayOfWeek == 8) {
							dayOfWeek = 1;
						} if (dayOfWeek == 1) {
								System.out.println(y + "/" + x + "/" + yearChoose + " Sunday");
						} else {
								 System.out.println(y + "/" + x + "/" + yearChoose);
						}
						dayOfWeek++;
					}
				}
				 yearChoose++;
			 }
			}
		
			private static void advance() { 
			for (int i = 1; i <= 12; i++) {
					 for (int j = 1; j <= nDaysInMonth(i, year); j++) {
						 
						 dayOfWeek++;
		
						if(dayOfWeek == 8) 
						 dayOfWeek = 1;
					 }
		
					 }
			}
		
		private static boolean isLeapYear(int year) {
			boolean leapYear = (year%400==0);
			if ((year % 4==0)&&(year%100!=0)||(leapYear)) {
				leapYear = true;
			} else {
				leapYear = false;
			}
			return leapYear;
		}
		
		private static int nDaysInMonth(int month, int year) {
			if ((month == 4) || (month == 6)|| (month == 9) || (month == 11)) {
				return 30;
			   } else if (month ==2)  {
							if (isLeapYear(year)) {
							   return 29;
								} else {
								   return 28;
								   }
			   } else{
				return 31;
			   }
			}
		}
			