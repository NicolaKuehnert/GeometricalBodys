

import java.io.File;

public class Main {

	public static void main(String[] args) {
		Circle myCircle = new Circle(new Point(3, 4), 7);
		Rectangle myRectangle = new Rectangle(new Point(3, 4), 3, 7);
		Square mySquare = new Square(new Point(6, 7), 3);
		Ellipse myEllipse = new Ellipse(new Point(14, 5), 5, 23);
		Ellipse myEllipse2 = new Ellipse(new Point(32, 42), 13, 17);

		ListPrimitives list = new ListPrimitives();
		try {
			list.add(myCircle);
			list.add(myRectangle);
			list.add(mySquare);
			list.add(myEllipse);
			list.add(myEllipse);
			list.add(myEllipse2);
			list.add(myEllipse);
			list.add(myEllipse);
			list.print();
			list.save(new File("blub.text"));
		} catch (WrongArgumentException e) {
			e.printStackTrace();
		}

		ListPrimitives list2 = new ListPrimitives();
		list2.load(new File("blub.text"));

		System.out.println("================================");
		System.out.println();
		list.remove(myEllipse);

		list.print();
		list.sortCircumference();
		System.out.println("================================");
		System.out.println();
		list.print();

		System.out.println("2. Liste =============== \n\n\n");
		list2.print();

		// System.out.println(myCircle);
		// System.out.println(myRectangle);
		// System.out.println(mySquare);
		// System.out.println(myEllipse);
		
		for(int i=0; i<10; i++)	System.out.println();
		
		ListRoundPrimitives listRound = new ListRoundPrimitives();
		
		try {
			listRound.add(myCircle);
			//listRound.add(myRectangle);
		} catch (AngularArgumentException e) {
			e.printStackTrace();
		}catch (WrongArgumentException e) {
			e.printStackTrace();
		}
		
		ListAngularPrimitives listAngular = new ListAngularPrimitives();
		
		try {
			listAngular.add(myRectangle);
			//listAngular.add(myCircle);
		} catch (RoundArgumentException e) {
			e.printStackTrace();
		}catch (WrongArgumentException e) {
			e.printStackTrace();
		}
		
		
		listAngular.getByIndex(0);
		
		//System.out.println("2 Exceptions ");
		
		
	}
}