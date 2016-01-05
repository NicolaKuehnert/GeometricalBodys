

public class Rectangle extends Primitive implements IAngular{

	private Point startPoint;
	private int length,height;
	private double circumference;
	private double area;
	
	public Rectangle (Point startPoint, int length, int height) {
		this.startPoint=startPoint;
		this.length=length;
		this.height=height;
		
		circumference = 2*length+2*height;
		area = length*height;
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
		return s+";"+startPoint.toString()+";"+length+";"+height;
	}
	
	
	public Point getStartPoint() {
		return startPoint;
	}
	
	public int getLength() {
		return length;
	}
	
	public int getHeight() {
		return height;
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