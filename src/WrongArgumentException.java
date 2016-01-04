

public class WrongArgumentException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public WrongArgumentException() {
		super("Ein falsches Argument wurde übergeben");
	}
	
	public WrongArgumentException(String ex) {
		super(ex);
	}
	

}
