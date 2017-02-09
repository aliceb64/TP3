public class Rectangle extends Polygone {
	public Rectangle(double xMin, double xMax, double yMin, double yMax) {
		super(new Point[4]);
		sommets[0] = new Point(xMin, yMin);
		sommets[1] = new Point(xMax, yMin);
		sommets[2] = new Point(xMax, yMax);
		sommets[3] = new Point(xMin, yMax);
	}
} 
