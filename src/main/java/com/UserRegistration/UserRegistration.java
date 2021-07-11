package com.UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	private final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,10}$";
	private final String EMAIL_PATTERN = "^[a-zA-Z0-9]{1,}[[.|+|-]a-zA-Z0-9]*@[a-zA-Z0-9]{1,}((.){1}+)([a-z]{1,3}+)(.[a-z]{2,3})*$";
	private final String PHONE_NUMBER_PATTERN = "[0-9]{2}[\\s][0-9]{10}$";
	private final String PASSWORD_PATTERN = ("^(?=.*[@#$%^&+=])(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$");

	public boolean validateFirstName(String firstName) throws UserDefinedException {

		Pattern pattern = Pattern.compile(NAME_PATTERN);
		Matcher matcher = pattern.matcher(firstName);
		if (!matcher.matches()) {
			throw new UserDefinedException("Enter a valid pattern");
		}
		return matcher.matches();
	}

	public boolean validateLastName(String lastName) throws UserDefinedException {
		Pattern pattern = Pattern.compile(NAME_PATTERN);
		Matcher matcher = pattern.matcher(lastName);
		if (!matcher.matches()) {
			throw new UserDefinedException("Enter a valid pattern");
		}
		return matcher.matches();
	}

	public boolean validateEmail(String email) throws UserDefinedException {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(email);
		if (!matcher.matches()) {
			throw new UserDefinedException("Enter a valid pattern");
		}
		return matcher.matches();
	}

	public boolean validatePhoneNumber(String phoneNumber) throws UserDefinedException {
		Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
		Matcher matcher = pattern.matcher(phoneNumber);
		if (!matcher.matches()) {
			throw new UserDefinedException("Enter a valid pattern");
		}
		return matcher.matches();
	}

	public boolean validatePassword(String password) throws UserDefinedException {
		Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
		Matcher matcher = pattern.matcher(password);
		if (!matcher.matches()) {
			throw new UserDefinedException("Enter a valid pattern");
		}
		return matcher.matches();
	}

}
