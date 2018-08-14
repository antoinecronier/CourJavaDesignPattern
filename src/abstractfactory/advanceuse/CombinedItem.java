package abstractfactory.advanceuse;

import abstractfactory.Color;
import abstractfactory.Shape;

public class CombinedItem {
	
	private Shape shape;
	private Color color;

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
