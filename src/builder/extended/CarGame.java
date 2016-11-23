package builder.extended;

public class CarGame extends Game{

	@Override
	public float price() {
		return 5.5f;
	}
	
	@Override
	public String name() {
		return "Car Game";
	}
}
