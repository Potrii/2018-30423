package user_pck;

import java.util.Arrays;
import java.util.List;

public class UserValidator {

	public List<String> cityCodes = Arrays.asList("125", "223", "478");

	// user validation failed ex
	public void validate(User user) throws UserValidationFailedException {
		// SSN
		// GYYMMDDCCCXYZ - 13 characters
		// G - gender (1/2)
		// YY - year
		// MM - month
		// DD - day
		// CCC - city code
		// XYZ - random digits

		String userSSN = user.getSSN();

		// check lenght
		if (userSSN.length() != 13) {
			throw new UserValidationFailedException("Invalid lenght!");
		} else
			System.out.println("User SSN has a valid lenght !");

		// check gender
		if (userSSN.substring(0, 1).equals("1") || userSSN.substring(0, 1).equals("2"))
			System.out.println("Valid gender");
		else
			throw new UserValidationFailedException("Invalid gender!");

		// check year

		int year = Integer.parseInt(userSSN.substring(1, 3));
		if (year >= 0 && year <= 99)
			System.out.println("Valid Year");
		else
			throw new UserValidationFailedException("Invalid year!");

		// check month
		// System.out.println(userSSN.substring(3,5));
		int month = Integer.parseInt(userSSN.substring(3, 5));
		if (month > 0 && month <= 12)
			System.out.println("Valid month");
		else
			throw new UserValidationFailedException("Invalid month!");

		// check day

		int day = Integer.parseInt(userSSN.substring(5, 7));
		if (day <= 31)
			System.out.println("Valid day");
		else
			throw new UserValidationFailedException("Invalid day!");

		int goodCity = 0;
		for (String city : cityCodes) {
			// System.out.println(goodCity + city + (userSSN.substring(7, 10) == city));
			if (userSSN.substring(7, 10).equals(city))
				goodCity = 1;
		}

		if (goodCity == 1)
			System.out.println("Valid city");
		else
			throw new UserValidationFailedException("Invalid city code!");
	}
}
