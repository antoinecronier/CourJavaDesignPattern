package facade;

public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;
	private Shape square;

	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}

	public void drawSquare() {
		square.draw();
	}

	// Derive from facade specificity

	private Shape shape;

	public static final String CIRCLE = "circle";
	public static final String RECTANGLE = "rectangle";
	public static final String SQUARE = "square";

	public ShapeMaker(String shape) {
		switch (shape) {
		case CIRCLE:
			this.shape = new Circle();
			break;

		case RECTANGLE:
			this.shape = new Rectangle();
			break;

		case SQUARE:
			this.shape = new Square();
			break;

		default:
			break;
		}
	}

	// Derive from facade specificity
	public void draw() {
		this.shape.draw();
	}

	// Derive from facade specificity
	public void draw(String shape) {
		switch (shape) {
		case CIRCLE:
			this.shape = new Circle();
			break;

		case RECTANGLE:
			this.shape = new Rectangle();
			break;

		case SQUARE:
			this.shape = new Square();
			break;

		default:
			break;
		}

		this.shape.draw();
	}
}
