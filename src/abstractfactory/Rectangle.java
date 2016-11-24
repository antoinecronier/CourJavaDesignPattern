package abstractfactory;

public class Rectangle implements Shape, Item {

	public static final String RECTANGLE = "RECTANGLE";

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

	@Override
	public String getName() {
		return RECTANGLE;
	}
}
