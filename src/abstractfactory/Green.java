package abstractfactory;

public class Green implements Color, Item {

	public static final String GREEN = "GREEN";

	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}

	@Override
	public String getName() {
		return GREEN;
	}
}
