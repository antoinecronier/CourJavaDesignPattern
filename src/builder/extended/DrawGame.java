package builder.extended;

public class DrawGame extends Game {

	@Override
	public float price() {
		return 1.0f;
	}

	@Override
	public String name() {
		return "Draw Game";
	}
}
