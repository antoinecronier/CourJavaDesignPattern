package abstractfactory;

public class ColorFactory extends AbstractFactory {

	public static final String COLOR = "COLOR";

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	Color getColor(String color) {

		if (color == null) {
			return null;
		}

		if (color.equalsIgnoreCase("RED")) {
			return new Red();

		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();

		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}

		return null;
	}

	@Override
	Item getItem(String item) {
		if (item == null) {
			return null;
		}

		if (item.equalsIgnoreCase("RED")) {
			return new Red();

		} else if (item.equalsIgnoreCase("GREEN")) {
			return new Green();

		} else if (item.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}

		return null;
	}
}
