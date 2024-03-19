
public class EnclosedPointTest {

	public static void main(String[] args) {
		try {
		EnclosedPoint ep = new EnclosedPoint (new Point (0.0, 0.0),
				new Point (5.0, 4.0));
		
		
		System.out.println(ep.width() + 
				    " "  + ep.height());
		
		System.out.println(ep.abscissa() + 
				     " " + ep.ordinate());

		ep.move(3.0, 2.0);
		
		System.out.println(ep.abscissa() + 
				     " " + ep.ordinate());

		ep.move(5.0, 6.0);
		
		System.out.println(ep.abscissa() + 
				     " " + ep.ordinate());
		
		Point pnt = ep;
		pnt.move(5.0, 6.0);
		
		System.out.println(pnt.abscissa() + 
				     " " + pnt.ordinate());
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

}