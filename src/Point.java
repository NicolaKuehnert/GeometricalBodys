

public class Point {
	private int X,Y;

	public Point(int x, int y) {
		super();
		X = x;
		Y = y;
	}
	@Override
	public String toString() {
		return "" + X + ";"+ Y;
	}

	public int getX() {
		return X;
	}

	public int getY() {
		return Y;
	}
}