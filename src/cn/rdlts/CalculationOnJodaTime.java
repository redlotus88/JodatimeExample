package cn.rdlts;

import org.joda.time.DateTime;
import org.joda.time.Period;

public class CalculationOnJodaTime {

	public static final String DATE_DISPLAY_FORMAT = "E MM/dd/yyyy HH:mm:ss.SSS";
	
	public static void main(String[] args) {
		DateTime current = new DateTime();
		// Plus
		System.out.println(current.plus(60 * 1000).toString(DATE_DISPLAY_FORMAT)); // Add one minute
		System.out.println(current.plusMinutes(1).toString(DATE_DISPLAY_FORMAT));
		System.out.println(current.plus(Period.weeks(1)).toString(DATE_DISPLAY_FORMAT)); // Add one week.
		System.out.println(current.plusDays(90).toString(DATE_DISPLAY_FORMAT));
		
		// Minus
		System.out.println(current.minusDays(90).toString(DATE_DISPLAY_FORMAT));
	}
}
