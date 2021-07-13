package com.UserRegistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {

	UserRegistration user;
	boolean result;
	String[] allEmails;

	@Before
	public void setup() {

		user = new UserRegistration();

	}

	// FirstName

	@Test
	public void testValidateFirstName() {
		boolean result = user.checkFirstName.validate("Rekha");
		Assert.assertEquals(true, result);
	}

	@Test
	public void testInvalidFirstName() {
		boolean result = user.checkFirstName.validate("abc1");
		Assert.assertEquals(false, result);
	}

	@Test
	public void testShortFirstName() {
		boolean result = user.checkFirstName.validate("ab");
		Assert.assertEquals(false, result);
	}

	// LastName

	@Test
	public void testValidateLastName() {
		boolean result = user.checkLastName.validate("Patil");
		Assert.assertEquals(true, result);
	}

	@Test
	public void testInvalidLastName() {
		boolean result = user.checkLastName.validate("rEK");
		Assert.assertEquals(false, result);
	}

	@Test
	public void testShortLastName() {
		boolean result = user.checkLastName.validate("re");
		Assert.assertEquals(false, result);
	}

	// email id

	@Test
	public void testvalidateEmail() {
		boolean result = user.checkEmail.validate("rekhapatil.1509@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void testanothervalidateEmail() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = user.checkEmail.validate("rekha15patil@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void testInvalidEmail() {
		boolean result = user.checkEmail.validate("rekhapatil.1509@gmail.");
		Assert.assertEquals(false, result);
	}

	@Test
	public void testNoextensionInvalidEmail() {
		boolean result = user.checkEmail.validate("rekhapatil.1509");
		Assert.assertEquals(false, result);
	}

	@Test
	public void testNospecialCharInvalidEmail() {
		boolean result = user.checkEmail.validate("rekhapatil.1509gmail.com");
		Assert.assertEquals(false, result);
	}

	// Phone Number

	@Test
	public void testValidPhoneNumber() {
		boolean result = user.checkMobileNum.validate("91 8095592954");
		Assert.assertEquals(true, result);
	}

	@Test
	public void testInvalidNoSpacePhoneNumber() {
		boolean result = user.checkMobileNum.validate("919090909090");
		Assert.assertEquals(false, result);
	}

	@Test
	public void testInvalidShortPhoneNumber() {
		boolean result = user.checkMobileNum.validate("89 89898989");
		Assert.assertEquals(false, result);
	}

	@Test
	public void testInvalidWithoutCountryCodePhoneNumber() {
		boolean result = user.checkMobileNum.validate("87100973678");
		Assert.assertEquals(false, result);
	}

	// Password

	@Test
	public void testValidPassword() {
		boolean result = user.checkPassword.validate("Rekha15@");
		Assert.assertEquals(true, result);
	}

	@Test
	public void testInvalidShortPassword() {
		boolean result = user.checkPassword.validate("rek15@");
		Assert.assertEquals(false, result);
	}

	@Test
	public void testInvalidSkipUpperCasePassword() {
		boolean result = user.checkPassword.validate("15rekha@");
		Assert.assertEquals(false, result);
	}

	@Test
	public void testInvalidSkipNumericValuePassword() {
		boolean result = user.checkPassword.validate("rekha@");
		Assert.assertEquals(false, result);
	}

	@Test
	public void testInvalidSkipSpecialCharacterPassword() {
		boolean result = user.checkPassword.validate("Rekhapatil5");
		Assert.assertEquals(false, result);
	}

	@Test
	public void All_Email_valid_True() {

		allEmails = new String[] { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
				"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com" };

		for (String emailIDs : allEmails) {

			result = user.checkEmail.validate(emailIDs);
			System.out.println(result);
			Assert.assertEquals(true, result);

		}

	}

	@Test
	public void All_Email_validation_false() {

		allEmails = new String[] { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
				".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
				"abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au" };

		for (String emailIDs : allEmails) {
			result = user.checkEmail.validate(emailIDs);
			System.out.println(result);
			Assert.assertFalse(result);

		}
	}
}
