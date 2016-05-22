package cn.rdlts;

import java.util.Calendar;

import org.joda.time.DateTime;

public class CreateJodaTime {
	
	public static void main(String[] args) {
		// To create a calendar.
		Calendar calendar = Calendar.getInstance();
		calendar.set(2000, Calendar.JANUARY, 1, 0, 0, 0);
		
		// Use JodaTime
		DateTime dateTime = new DateTime(2000, 1, 1, 0, 0, 0, 0);
		System.out.println(dateTime);
		System.out.println(dateTime.toString("yyyy-MM-dd hh:mm:ss"));
		System.out.println(dateTime.toLocalDate());
	}
}
