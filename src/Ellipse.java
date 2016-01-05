

public class Ellipse extends Primitive implements IRound{
	private Point center;
	private int longSemiaxis;
	private int shortSemiaxis;
	private double circumference;
	private double area;
	
	public Ellipse(Point center, int longSemiaxis, int shortSemiaxis) {
		super();
		this.center = center;
		this.longSemiaxis = longSemiaxis;
		this.shortSemiaxis = shortSemiaxis;

		circumference = Math.PI*(longSemiaxis+shortSemiaxis);
		area = Math.PI*longSemiaxis*shortSemiaxis;
	}
	
	@Override
	public double getCircumference() {
		return circumference;
	}

	@Override
	public double getArea() {
		return area;
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

	@Override
	public int compareUmfang(Primitive p) {
		if(p.getCircumference() > getCircumference()){
            return 1;
        }
        else if( p.getCircumference() < getCircumference())
        {
            return -1;
        }
        else
        {
            return 0;
        }
	}
	
	@Override
	public int compareArea(Primitive p) {
		if(p.getArea() > getArea()){
            return 1;
        }
        else if( p.getArea() < getArea())
        {
            return -1;
        }
        else
        {
            return 0;
        }
	}
}