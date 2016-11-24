package abstractfactory;

public class Red implements Color, Item {

	public static final String RED = "RED";

	@Override
	public void fill() {
		System.out.println("Inside Red::fill() method.");
	}

	@Override
	public String getName() {
		return RED;
	}
}
