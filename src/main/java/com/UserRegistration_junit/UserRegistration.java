package com.UserRegistration_junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	private final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
	private final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";
	private final String PHONE_NUMBER_PATTERN = "^((\\+)?(\\d{2}[\\s]))?(\\d{10}){1}?$";
	private final String PASSWORD_PATTERN = ("^(?=.*[@#$%^&+=])(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$");

	/**
	 * Uc1:
	 * 
	 * @method validateFirstName Check the pattern for first name
	 * @return boolean this returns true/false based on the firstname test result
	 */
	public boolean validateFirstName(String firstName) {
		Pattern pattern = Pattern.compile(NAME_PATTERN);
		Matcher matcher = pattern.matcher(firstName);
		boolean result = matcher.matches();
		return result;
	}

	/**
	 * Uc2:
	 * 
	 * @method validateLastName Check the pattern for first name
	 * @return boolean this returns true/false based on the firstname test result
	 */
	public boolean validateLastName(String lastName) {
		Pattern pattern = Pattern.compile(NAME_PATTERN);
		Matcher matcher = pattern.matcher(lastName);
		boolean result = matcher.matches();
		return result;
	}

	/**
	 * Uc3 and Uc9:
	 * 
	 * @method validateEmail Check the pattern for email
	 * @return boolean this returns true/false based on the email test result
	 */

	public boolean validateEmail(String email) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(email);
		boolean result = matcher.matches();
		return result;
	}

	/**
	 * Uc4:
	 * 
	 * @method validatePhoneNumber Check the pattern for Phone Number
	 * @return boolean this returns true/false based on the phoneNumber test result
	 */
	public boolean validatePhoneNumber(String phoneNumber) {
		Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
		Matcher matcher = pattern.matcher(phoneNumber);
		boolean result = matcher.matches();
		return result;
	}

	/**
	 * Uc5:
	 * 
	 * @method validatePassword Check the pattern for Password
	 * @return boolean this returns true/false based on the password test result
	 *         Rule 1: Should contain atleast 8 character Uc6: Rule 2: should
	 *         contain atleast 1 Uppercase letter Uc7: Rule 3: should contain
	 *         atleast 1 number Uc8: Rule 4: should contain atleast 1 special
	 *         character
	 */

	public boolean validatePassword(String password) {
		Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
		Matcher matcher = pattern.matcher(password);
		boolean result = matcher.matches();
		return result;
	}

}
