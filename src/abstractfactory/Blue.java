package abstractfactory;

public class Blue implements Color {

	public static String BLUE = "BLUE";

	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}
}
