package geometry;

public class AngularArgumentException extends WrongArgumentException {

	private static final long serialVersionUID = 1L;
	public AngularArgumentException() {
		super("No angular Objects allowed");
	}
	
	public AngularArgumentException(String ex) {
		super(ex);
	}
	
}
