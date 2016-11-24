package abstractfactory;

public class Blue implements Color, Item {

	public static final String BLUE = "BLUE";

	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}

	@Override
	public String getName() {
		return BLUE;
	}
}
