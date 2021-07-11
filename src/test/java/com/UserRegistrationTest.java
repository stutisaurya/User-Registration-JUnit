package com;

import org.junit.Assert;
import org.junit.Test;

import com.UserRegistration_junit.UserRegistration;

public class UserRegistrationTest {

	// FirstName

	@Test
	public void testValidateFirstName() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateFirstName("Stuti");
		Assert.assertEquals(true, result);
	}

	@Test
	public void testInvalidFirstName() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateFirstName("abc1");
		Assert.assertEquals(false, result);
	}

	@Test
	public void testShortFirstName() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateFirstName("ab");
		Assert.assertEquals(false, result);
	}

	// LastName

	@Test
	public void testValidateLastName() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateLastName("Saurya");
		Assert.assertEquals(true, result);
	}

	@Test
	public void testInvalidLastName() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateLastName("sTU");
		Assert.assertEquals(false, result);
	}

	@Test
	public void testShortLastName() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateLastName("st");
		Assert.assertEquals(false, result);
	}

	// email id

	@Test
	public void testvalidateEmail() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateEmail("stuti.1@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void testanothervalidateEmail() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateEmail("stuti10@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void testInvalidEmail() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateEmail("stuti.1509@gmail.");
		Assert.assertEquals(false, result);
	}

	@Test
	public void testNoextensionInvalidEmail() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateEmail("stuti.1509");
		Assert.assertEquals(false, result);
	}

	@Test
	public void testNospecialCharInvalidEmail() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateEmail("stuti.1509gmail.com");
		Assert.assertEquals(false, result);
	}

	// Phone Number

	@Test
	public void testValidPhoneNumber() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePhoneNumber("91 8095592954");
		Assert.assertEquals(true, result);
	}

	@Test
	public void testInvalidNoSpacePhoneNumber() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePhoneNumber("919090909090");
		Assert.assertEquals(false, result);
	}

	@Test
	public void testInvalidShortPhoneNumber() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePhoneNumber("89 89898989");
		Assert.assertEquals(false, result);
	}

	@Test
	public void testInvalidWithoutCountryCodePhoneNumber() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePhoneNumber("87100973678");
		Assert.assertEquals(false, result);
	}

// Password

	@Test
	public void testValidPassword() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePassword("Stuti15@");
		Assert.assertEquals(true, result);
	}

	@Test
	public void testInvalidShortPassword() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePassword("stu15@");
		Assert.assertEquals(false, result);
	}

	@Test
	public void testInvalidSkipUpperCasePassword() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePassword("15stua@");
		Assert.assertEquals(false, result);
	}

	@Test
	public void testInvalidSkipNumericValuePassword() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePassword("stuti@");
		Assert.assertEquals(false, result);
	}

	@Test
	public void testInvalidSkipSpecialCharacterPassword() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePassword("stutisaurya5");
		Assert.assertEquals(false, result);
	}

}
