package geometry;

public class MyArrayOutOfBoundsException extends ArrayIndexOutOfBoundsException{

	private static final long serialVersionUID = 1L;

	public MyArrayOutOfBoundsException() {
		super("Position ist null");
	}
}
