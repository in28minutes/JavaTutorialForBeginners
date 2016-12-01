package com.in28minutes.java.beginner.junit.examples.enums;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;

import org.junit.Test;

public class EnumTest {

	enum SeasonDefault {
		WINTER, SPRING, SUMMER, FALL
	};
	
	@Test
	public void enumValueOf() {
		SeasonDefault season = SeasonDefault.valueOf("FALL");
		assertEquals(SeasonDefault.FALL, season);
	}

	@Test
	public void stringToEnum() {
		final String string = "FALL";
		SeasonDefault season = SeasonDefault.valueOf(string);
		assertEquals(SeasonDefault.FALL, season);
	}
	
	@Test
	public void enumToString() {
		SeasonDefault season = SeasonDefault.FALL;
		String seasonName = season.name();
		assertEquals("FALL", seasonName);
	}
	
	@Test
	public void enumOrdinalsDefault() {
		// By default java assigns ordinals in order
		assertEquals(0, SeasonDefault.WINTER.ordinal());
		assertEquals(1, SeasonDefault.SPRING.ordinal());
		assertEquals(2, SeasonDefault.SUMMER.ordinal());
		assertEquals(3, SeasonDefault.FALL.ordinal());
	}

	@Test(expected = IllegalArgumentException.class)
	public void enumValueOfInValidValue() {
		@SuppressWarnings("unused")
		SeasonDefault season = SeasonDefault.valueOf("DUMMY");
	}

	@Test
	public void loopEnum() {
		// You can loop around all enum values
		// For kicks I'm putting them into an arrayList
		ArrayList<String> alEnums = new ArrayList<String>();

		for (SeasonDefault season : SeasonDefault.values()) {
			alEnums.add(season.name());
		}

		assertEquals(Arrays.asList("WINTER", "SPRING", "SUMMER", "FALL"),
				alEnums);
	}

	enum SeasonCustomized {
		WINTER(1), SPRING(2), SUMMER(3), FALL(4);

		private int code;

		public int getCode() {
			return code;
		}

		private SeasonCustomized(int code) {
			this.code = code;
		}
	};

	@Test
	public void enumPrivateVariables() {
		SeasonCustomized season = SeasonCustomized.WINTER;
		assertEquals(season.getCode(), 1);
	}

	@Test
	public void loopEnumComplex() {
		// You can loop around all enum values
		// For kicks I'm putting them into an arrayList
		ArrayList<Integer> alEnumCodes = new ArrayList<Integer>();

		for (SeasonCustomized season : SeasonCustomized.values()) {
			alEnumCodes.add(season.getCode());
		}

		assertEquals(Arrays.asList(1, 2, 3, 4), alEnumCodes);
	}

	interface Code {
		int getCode();
	}
	enum SeasonEnhanced implements Code{
		WINTER(1), SPRING(2), SUMMER(3), FALL(4);

		private int code;

		public int getCode() {
			return code;
		}

		private SeasonEnhanced(int code) {
			this.code = code;
		}

		public int getExpectedMaxTemperature() {
			switch (this) {
			case WINTER:
				return 5;
			case SPRING:
			case FALL:
				return 10;
			case SUMMER:
				return 20;
			}
			return -1;// Dummy since Java does not recognize this is possible :)
		}

		public static SeasonEnhanced valueOf(int code) {
			for (SeasonEnhanced season : SeasonEnhanced.values()) {
				if (season.getCode() == code)
					return season;
			}
			throw new RuntimeException("value not found");// Just for kicks
		}
	};

	@Test
	public void enumSwitch() {
		SeasonEnhanced season = SeasonEnhanced.SPRING;
		assertEquals(10, season.getExpectedMaxTemperature());
	}

	@Test
	public void enumCreationFromCode() {
		SeasonEnhanced season = SeasonEnhanced.valueOf(1);
		assertEquals(SeasonEnhanced.WINTER, season);
	}

	@Test
	public void enumsetRange() {
		ArrayList<Integer> alEnumCodes = new ArrayList<Integer>();

		// We use EnumSet.range
		for (SeasonEnhanced season : EnumSet.range(SeasonEnhanced.SPRING,
				SeasonEnhanced.FALL)) {
			alEnumCodes.add(season.getCode());
		}

		// All values except winter
		assertEquals(Arrays.asList(2, 3, 4), alEnumCodes);
	}
	
	enum EnumSwitchExample {
		WINTER, SPRING, SUMMER, FALL;
		public int getExpectedMaxTemperature() {
			switch (this) {
			case WINTER:
				return 5;
			case SPRING:
			case FALL:
				return 10;
			case SUMMER:
				return 20;
			}
			return -1;// Dummy since Java does not recognize this is possible :)
		}

	};

	@Test
	public void enumSwitchTest() {
		EnumSwitchExample example = EnumSwitchExample.SPRING;
		assertEquals(10, example.getExpectedMaxTemperature());
	}

}