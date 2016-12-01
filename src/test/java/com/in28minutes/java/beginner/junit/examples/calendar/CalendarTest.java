package com.in28minutes.java.beginner.junit.examples.calendar;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.junit.Test;

public class CalendarTest {

	@Test
	public void createCalendarFromDate() throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy-MM-dd");
		Date date = sdf.parse("2012-8-15");

		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);

		assertEquals(2012, calendar.get(Calendar.YEAR));
		assertEquals(8 - 1, calendar.get(Calendar.MONTH));
		assertEquals(15, calendar.get(Calendar.DATE));

	}

	@Test
	public void testCalendarCreation() {
		Calendar calendar = 
			new GregorianCalendar(2011, 7, 15);

		assertEquals(15, 
				calendar.get(Calendar.DATE));
		assertEquals(2011, 
				calendar.get(Calendar.YEAR));
		assertEquals(3, 
				calendar.get(Calendar.WEEK_OF_MONTH));
		assertEquals(34, 
				calendar.get(Calendar.WEEK_OF_YEAR));
		assertEquals(227, 
				calendar.get(Calendar.DAY_OF_YEAR));
	}

	@Test
	public void dayFromCalendar() {
		Calendar calendar = 
			new GregorianCalendar(2011, 7, 15);

		assertEquals(15, 
				calendar.get(Calendar.DATE));
	}

	@Test
	public void yearFromCalendar() {
		Calendar calendar = 
			new GregorianCalendar(2011, 7, 15);
		
		assertEquals(2011, 
				calendar.get(Calendar.YEAR));

	}

	@Test
	public void weekOfMonthFromCalendar() {
		Calendar calendar = 
			new GregorianCalendar(2011, 7, 15);
		assertEquals(3, calendar
				.get(Calendar.WEEK_OF_MONTH));
	}

	@Test
	public void weekOfYearFromCalendar() {
		Calendar calendar = 
			new GregorianCalendar(2011, 7, 15);

		assertEquals(34, calendar
				.get(Calendar.WEEK_OF_YEAR));
	}

	@Test
	public void dayOfYearFromCalendar() {
		Calendar calendar = 
			new GregorianCalendar(2011, 7, 15);

		assertEquals(227, calendar
				.get(Calendar.DAY_OF_YEAR));
	}

	@Test
	public void calendarChangeDate() {
		Calendar calendar = 
			new GregorianCalendar(2011, 7, 15);

		calendar.set(Calendar.DATE, 24);
		calendar.set(Calendar.MONTH, 8);

		assertEquals(24, calendar
				.get(Calendar.DATE));
		assertEquals(8, calendar
				.get(Calendar.MONTH));

	}

	@Test
	public void calendarChangeYear() {
		Calendar calendar = 
			new GregorianCalendar(2011, 7, 15);

		calendar.set(Calendar.YEAR, 2013);

		assertEquals(2013, 
				calendar.get(Calendar.YEAR));
	}

	@Test
	public void calendarAddDays() {
		Calendar calendar = new GregorianCalendar(2011, 7,
				15);

		calendar.add(Calendar.DATE, 5);

		assertEquals(232, calendar
				.get(Calendar.DAY_OF_YEAR));
	}

	@Test
	public void calendarAddMonths() {
		Calendar calendar = new GregorianCalendar(2011, 7,
				15);

		calendar.add(Calendar.MONTH, 1);

		assertEquals(258, calendar
				.get(Calendar.DAY_OF_YEAR));
	}

	@Test
	public void calendarAddYears() {
		Calendar calendar = new GregorianCalendar(2011, 7,
				15);
		calendar.add(Calendar.YEAR, 2);
		assertEquals(2013, calendar.get(Calendar.YEAR));
	}

	@Test
	public void calendarFromDate() throws ParseException {
		final String dateString = "JAN 23, 1945";
		Date date = new SimpleDateFormat("MMM d, yyyy",
				Locale.ENGLISH).parse(dateString);

		// Create a new calendar object and do setTime
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);

		assertEquals(23, calendar.get(Calendar.DATE));
		assertEquals(Calendar.JANUARY, calendar
				.get(Calendar.MONTH));
		assertEquals(1945, calendar.get(Calendar.YEAR));
	}
	
	@Test
	public void compareCalendars() throws ParseException {

		Calendar augustFirst = 
				new GregorianCalendar(2012,8,1);
		Calendar septemberFirst = 
				new GregorianCalendar(2012,9,1);
		
		assertEquals(-1,
				augustFirst.compareTo(septemberFirst));
		assertEquals(1,
				septemberFirst.compareTo(augustFirst));
		assertEquals(0,
				septemberFirst.compareTo(septemberFirst));
	}

	@Test
	public void calendarFormat() 
						throws ParseException {
		Calendar augustFirst2012 = 
				new GregorianCalendar(2012, 7, 1);

		assertEquals("12-08-01", 
				new SimpleDateFormat("yy-MM-dd").
				format(augustFirst2012.getTime()));
		
		assertEquals("12-Aug-01", 
				new SimpleDateFormat("yy-MMM-dd").
				format(augustFirst2012.getTime()));

		assertEquals("12-8-1", 
				new SimpleDateFormat("yy-M-d").
				format(augustFirst2012.getTime()));
	}


}