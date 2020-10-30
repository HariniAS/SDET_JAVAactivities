package JavaActivity2_4_CustomException;

class customException extends Exception {
	private String message = null;
	public customException(String msg) {
		message = msg;
	}
	@Override
	public String getMessage() {
	    return message;
	}
}

public class Activity2_4_CustomException {
	public static void main(String[] args) {
		try {
			Activity2_4_CustomException.exceptionTest("Will print to console");
			Activity2_4_CustomException.exceptionTest(null);
		}
		catch (customException ce) {
			System.out.println(ce.getMessage());
		}
	}
	public static void exceptionTest(String msg) throws customException {
		if (msg.equals(null)) {
			throw new customException("String value is null");
		}
		else {
			System.out.println(msg);
		}
	}

}
