package abstractfactory;

public class Circle implements Shape, Item {

	public static final String CIRCLE = "CIRCLE";

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

	@Override
	public String getName() {
		return CIRCLE;
	}
}
