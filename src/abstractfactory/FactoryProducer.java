package abstractfactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();

		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}

		return null;
	}

	public static Item getItem(String choice) {

		Item item = new ShapeFactory().getItem(choice);
		if (item == null) {
			item = new ColorFactory().getItem(choice);
		}

		if (item != null) {
			return item;
		}

		return null;
	}
}
