

public class Rectangle extends Primitive implements IAngular{

	private Point startPoint;
	private int length,height;
	
	public Rectangle (Point startPoint, int length, int height) {
		this.startPoint=startPoint;
		this.length=length;
		this.height=height;
	}
	
	
	@Override
	public double getCircumference() {
		return 2*length+2*height;
	}

	@Override
	public double getArea() {
		return length*height;
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
	public int compareTo(Primitive p) {
		if(p.getCircumference() > getCircumference()){
            System.out.println("Umfang von " + p + " ist groesser!");
            return 1;
        }
        else if( p.getCircumference() < getCircumference())
        {
            System.out.println("Umfang von " + p +" ist kleiner!");
            return -1;
        }
        else
        {
            System.out.println("Umfang von " + p +" ist gleich gross!");
            return 0;
        }
	}
}