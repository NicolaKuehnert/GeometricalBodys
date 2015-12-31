package geometry;

public class Circle extends Ellipse implements IRound {
	
	public Circle(Point center, int radius) {
		super(center, radius, radius);
	}
	
	public int getRadius() {
		return getLongSemiaxis();
	}
	
//	@Override
//	public String toString() {
//		String s="";
//		s+="Typ: "+getClass()+";"+"area: "+String.format("%4.2f", getArea())+";"+"circumference: "+String.format("%4.2f",getCircumference());
//		return s+";"+this.getCenter()+";"+this.getLongSemiaxis();
//	}

}