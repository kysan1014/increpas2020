package day16;

public class NotIntegerException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3908052095976204880L;

	public NotIntegerException() {
	}
	
	public NotIntegerException(String msg) {
		super(msg);
	}
}
