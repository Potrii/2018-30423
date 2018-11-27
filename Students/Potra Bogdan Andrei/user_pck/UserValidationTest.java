package user_pck;

import org.junit.Test;

public class UserValidationTest {

	@Test
	public void Test() {
		User user1 = new User("1980714125796");
		User user2 = new User("2992013123123");
		User user3 = new User("3000000000000");

		UserValidator myValidator = new UserValidator();

		// valid user1
		try {
			System.out.println("First user !");
			myValidator.validate(user1);
		} catch (UserValidationFailedException Exception) {
			System.out.println("Validation problems at user 1");
		}

		// invalid user 2 at month

		try {
			System.out.println("\nSecond  user !");
			myValidator.validate(user2);
		} catch (UserValidationFailedException Exception) {
			System.out.println("Validation problems at user 2");
		}

		// invalid user 3 at gender
		try {
			System.out.println("\nThird user !");
			myValidator.validate(user3);
		} catch (UserValidationFailedException Exception) {
			System.out.println("Validation problems at user 3");
		}

	}
}
