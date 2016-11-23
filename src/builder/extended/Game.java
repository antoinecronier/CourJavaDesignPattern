package builder.extended;

import builder.Item;
import builder.Packing;

public abstract class Game implements Item {

	@Override
	public Packing packing() {
		return new Plastic();
	}

	@Override
	public abstract float price();

}
