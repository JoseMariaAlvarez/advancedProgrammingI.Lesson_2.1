public class Square extends Poligon {
	private double side;

	public Square(Point[] vs){
		super(vs);
		this.side = vs[0].distance(vs[1]);
	}
	
	@Override
	public double perimeter() {
		return 4.0 * side;
	}
	
}