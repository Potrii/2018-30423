package user_pck;

public class UserValidationFailedException extends Exception {

	public UserValidationFailedException(String message) {
		// super(message);
		System.out.println(message);
	}
}
