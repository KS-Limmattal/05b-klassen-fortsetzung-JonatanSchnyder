import java.awt.Point;

public class PointTester {

	public static void main(String[] args) {
		Point a = new Point(2,5);
		System.out.println(a.toString());
		a.setLocation(a.getY(), a.getX());
		System.out.println(a.toString());

		Point b = new Point(a);
		System.out.println(b.toString());

		System.out.println((a==b)?"a == b":"a != b");
		System.out.println((a.getX() == b.getX() && a.getY() == b.getY()) ? "a === b" : "a !== b");
	}
}
