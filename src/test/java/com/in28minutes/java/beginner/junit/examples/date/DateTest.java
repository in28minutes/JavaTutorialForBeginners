package com.in28minutes.java.beginner.junit.examples.date;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.junit.Ignore;
import org.junit.Test;

public class DateTest {
	@SuppressWarnings("deprecation")
	@Test
	@Ignore("Ignored because date returns today's date when the junit is run")
	public void dateCreateTodaysDate() {
		Date date = new Date();
		assertEquals(9, date.getDate()); /* DONT_DO_THIS */
		assertEquals(3, date.getDay()); /* DONT_DO_THIS */
		assertEquals(2012 - 1900, date.getYear());// 112 + 1900 /*DONT_DO_THIS*/
	}

	@SuppressWarnings("deprecation")
	@Test
	public void dateCreationWithMonthDayYear() {
		Date date = new Date(112, 7, 15); /* DONT_DO_THIS */
		assertEquals(15, date.getDate()); /* DONT_DO_THIS */
		assertEquals(2012 - 1900, date.getYear());// 112 + 1900 /*DONT_DO_THIS*/
	}

	@Test
	public void dateCreateFromString()
			throws ParseException {

		final String dateString = "SEP 15, 2021";

		Calendar calendar = new GregorianCalendar();

		Date date = new SimpleDateFormat("MMM d, yyyy",
				Locale.ENGLISH).parse(dateString);
		calendar.setTime(date);

		assertEquals(15, calendar.get(Calendar.DATE));
		assertEquals(Calendar.SEPTEMBER, calendar
				.get(Calendar.MONTH));
		assertEquals(2021, calendar.get(Calendar.YEAR));
	}

	@Test
	public void dateToCalendar() throws ParseException {
		final String dateString = "JUL 15, 2045";
		Date date = new SimpleDateFormat("MMM d, yyyy",
				Locale.ENGLISH).parse(dateString);

		// Create a new calendar object and do setTime
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);

		assertEquals(15, calendar.get(Calendar.DATE));
		assertEquals(Calendar.JULY, calendar
				.get(Calendar.MONTH));
		assertEquals(2045, calendar.get(Calendar.YEAR));
	}

	@Test
	public void dateGetTimeInMilliSeconds()
			throws ParseException {
		long dateUsingDate = new Date().getTime();
		long dateUsingSystem = System.currentTimeMillis();

		// Just a safety net comparison
		assertTrue(dateUsingDate <= dateUsingSystem);
	}

	@Test
	public void dateTimeInNanoSeconds()
			throws ParseException {
		long timeInNanoSeconds = System.nanoTime();

		// Just a safety net comparison
		assertTrue(timeInNanoSeconds > 0);
	}

	@Test
	public void compareDates() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy-MM-dd");

		Date augustFirst = sdf.parse("2012-8-1");
		Date septemberFirst = sdf.parse("2012-9-1");

		assertEquals(-1, augustFirst
				.compareTo(septemberFirst));
		assertEquals(1, septemberFirst
				.compareTo(augustFirst));
		assertEquals(0, septemberFirst
				.compareTo(septemberFirst));
	}

	@Test
	public void dateFormat() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy-MM-dd");
		Date augustFirst2012 = sdf.parse("2012-8-1");

		assertEquals("12-08-01", new SimpleDateFormat(
				"yy-MM-dd").format(augustFirst2012));
		
		assertEquals("12-Aug-01", new SimpleDateFormat(
				"yy-MMM-dd").format(augustFirst2012));

		assertEquals("12-8-1", new SimpleDateFormat(
				"yy-M-d").format(augustFirst2012));
	}
}