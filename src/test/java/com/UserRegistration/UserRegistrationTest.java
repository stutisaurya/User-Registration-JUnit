package com.UserRegistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	// FirstName

	@Test
	public void testValidateFirstName() throws UserDefinedException {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateFirstName("Stuti");
		Assert.assertEquals(true, result);
	}

	@Test(expected = UserDefinedException.class)
	public void testInvalidFirstName() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		UserRegistration.validateFirstName("abc1");
	}

	@Test(expected = UserDefinedException.class)
	public void testShortFirstName() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		UserRegistration.validateFirstName("ab");
	}

	// LastName

	@Test
	public void testValidateLastName() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		boolean result = UserRegistration.validateLastName("Saurya");
		Assert.assertEquals(true, result);
	}

	@Test(expected = UserDefinedException.class)
	public void testInvalidLastName() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		UserRegistration.validateLastName("sTu");
	}

	@Test(expected = UserDefinedException.class)
	public void testShortLastName() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		UserRegistration.validateLastName("st");
	}

	// Phone Number

	@Test
	public void testValidPhoneNumber() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		boolean result = UserRegistration.validatePhoneNumber("91 7028714423");
		Assert.assertEquals(true, result);
	}

	@Test(expected = UserDefinedException.class)
	public void testInvalidNoSpacePhoneNumber() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		UserRegistration.validatePhoneNumber("918605161014");
	}

	@Test(expected = UserDefinedException.class)
	public void testInvalidShortPhoneNumber() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		UserRegistration.validatePhoneNumber("89 905161014");
	}

	@Test(expected = UserDefinedException.class)
	public void testInvalidWithoutCountryCodePhoneNumber() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		UserRegistration.validatePhoneNumber("7020716423");
	}

//Password

	@Test
	public void testValidPassword() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		boolean result = UserRegistration.validatePassword("Stuti15@");
		Assert.assertEquals(true, result);
	}

	@Test(expected = UserDefinedException.class)
	public void testInvalidShortPassword() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		UserRegistration.validatePassword("Stu15@");
	}

	@Test(expected = UserDefinedException.class)
	public void testInvalidSkipUpperCasePassword() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		UserRegistration.validatePassword("24stuti@");
	}

	@Test(expected = UserDefinedException.class)
	public void testInvalidSkipNumericValuePassword() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		UserRegistration.validatePassword("Stuti@");
	}

	@Test(expected = UserDefinedException.class)
	public void testInvalidSkipSpecialCharacterPassword() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		UserRegistration.validatePassword("Stuti15");
	}

}
