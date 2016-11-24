package bridge;

public class BridgePatternDemo {
	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
		Circle blueCircle = new Circle(10, 10, 5, new BlueCircle());
		RedCircle redCircleConcrete = new RedCircle(10,5,8);


		redCircle.draw();
		greenCircle.draw();
		blueCircle.draw();

		blueCircle.setToBackground();
		((Circle) greenCircle).setToBackground();

		redCircleConcrete.drawCircle();
		redCircleConcrete.setToForeground();
	}
}
