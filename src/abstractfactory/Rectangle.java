package abstractfactory;

public class Rectangle implements Shape {

	public static String RECTANGLE = "RECTANGLE";

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
