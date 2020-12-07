package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.StringCalculators;

public class TestCalculator {
	public StringCalculators sc = new StringCalculators();

	@Test
	// Testing for empty value
	public void emptyStringreturnZero() {
		assertEquals(sc.add(""), 0);
	}

	@Test
	// Testing for SingleValues
	public void singleValueReturn() {
		assertEquals(sc.add("1"), 1);
	}

	@Test
	// Testing for Two values with comma Delimeter
	public void twoValueWithCommaDelimeted() {
		assertEquals(sc.add("1,2"), 3);
	}

}