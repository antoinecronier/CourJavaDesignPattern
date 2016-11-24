package facade;

public class FacadePatternDemo {
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();

		//Derive from facade use
		ShapeMaker maker = new ShapeMaker(ShapeMaker.CIRCLE);
		maker.draw();

		//Derive from facade use
		ShapeMaker maker1 = new ShapeMaker();
		maker1.draw(ShapeMaker.CIRCLE);
	}
}
