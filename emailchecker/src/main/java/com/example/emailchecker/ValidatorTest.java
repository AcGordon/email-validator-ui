package com.example.emailchecker;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidatorTest {

	@Test
	public void testBasicFailure() {
		assertEquals(Validator.validateEmail("failurecase"), false);
	}
	@Test
	public void testFailureAt() {
		assertEquals(Validator.validateEmail("failurecase@"), false);
	}
	@Test
	public void testFailurePeriod() {
		assertEquals(Validator.validateEmail("failurecase."), false);
	}
	@Test
	public void testFailureBadExtension() {
		assertEquals(Validator.validateEmail("sucesscase@.aaa"), false);
	}
	@Test
	public void testFailureStartingAt() {
		assertEquals(Validator.validateEmail("@sucesscase.com"), false);
	}
	@Test
	public void testSuccess() {
		assertEquals(Validator.validateEmail("al884513@dal.ca"), true);
	}

}
