package geometry;

public class RoundArgumentException extends WrongArgumentException {

	private static final long serialVersionUID = 1L;

	public RoundArgumentException() {
		super("No round Objects allowed");
	}
	
	public RoundArgumentException(String ex) {
		super(ex);
	}
}
