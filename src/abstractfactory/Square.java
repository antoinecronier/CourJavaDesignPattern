package abstractfactory;

public class Square implements Shape, Item {

	public static final String SQUARE = "SQUARE";

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}

	@Override
	public String getName() {
		return SQUARE;
	}
}
