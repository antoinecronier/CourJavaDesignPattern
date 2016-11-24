package bridge;

public class RedCircle implements DrawAPI {
	private int x, y, radius;

	public RedCircle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public RedCircle() {
	}

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: red, radius: " + radius
				+ ", x: " + x + ", " + y + "]");
	}

	public void drawCircle() {
		System.out.println("Drawing Circle[ color: red, radius: " + this.radius
				+ ", x: " + this.x + ", " + this.y + "]");
	}

	public void setToForeground(){
		System.out.println("Set item to foreground");
	}
}
