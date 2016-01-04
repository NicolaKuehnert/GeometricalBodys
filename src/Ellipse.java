

public class Ellipse extends Primitive implements IRound{
	private Point center;
	private int longSemiaxis;
	private int shortSemiaxis;
	
	public Ellipse(Point center, int longSemiaxis, int shortSemiaxis) {
		super();
		this.center = center;
		this.longSemiaxis = longSemiaxis;
		this.shortSemiaxis = shortSemiaxis;
	}
	
	@Override
	public double getCircumference() {
		return Math.PI*(longSemiaxis+shortSemiaxis);
	}

	@Override
	public double getArea() {
		return Math.PI*longSemiaxis*shortSemiaxis;
	}
	
	@Override
	public String toString() {
		String s=super.toString();
		return s+";"+this.getCenter()+";"+this.getLongSemiaxis()+";"+this.getShortSemiaxis();
	}

	public Point getCenter() {
		return center;
	}

	public int getLongSemiaxis() {
		return longSemiaxis;
	}

	public int getShortSemiaxis() {
		return shortSemiaxis;
	}
}