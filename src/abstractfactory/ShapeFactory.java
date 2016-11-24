package abstractfactory;

public class ShapeFactory extends AbstractFactory {

	public static final String SHAPE = "SHAPE";

	@Override
	public Shape getShape(String shapeType) {

		if (shapeType == null) {
			return null;
		}

		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();

		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;
	}

	@Override
	Color getColor(String color) {
		return null;
	}

	@Override
	Item getItem(String item) {
		if (item == null) {
			return null;
		}

		if (item.equalsIgnoreCase("CIRCLE")) {
			return new Circle();

		} else if (item.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		} else if (item.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;
	}
}
