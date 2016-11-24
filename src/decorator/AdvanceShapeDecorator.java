package decorator;

public class AdvanceShapeDecorator extends RedShapeDecorator {

	public AdvanceShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);

	}

	@Override
	public void draw() {
		decoratedShape.draw();
		super.setRedBorder(decoratedShape);
		setFontColor(decoratedShape);
	}

	private void setFontColor(Shape decoratedShape) {
		System.out.println("Font Color: Black");
	}

	public void repaint(){
		System.out.println("Repaint it");
	}
}
