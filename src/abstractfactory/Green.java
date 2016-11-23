package abstractfactory;

public class Green implements Color {

	public static String GREEN = "GREEN";

	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}
}
