
/**
 * This is InvalidNumberException class that
 * informs user that number is not valid
 * @author nabil
 *
 */
public class InvalidNumberException extends Exception {

	/**
	 * this is no-argument constructor
	 */
	public InvalidNumberException() {
		super("Sorry! Not a valid number.");
	}

	/**
	 * this is parameterized constructor
	 * @param message custom message defined by programmer
	 */
	public InvalidNumberException(String message) {
		super(message);
	}

}
