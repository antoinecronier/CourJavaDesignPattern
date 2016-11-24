package command;

public class Stock {

	private String name;
	private int quantity;
	private GlobalStock globalStock;

	public Stock(String name){
		this.name = name;
		this.quantity = 0;
	}

	public Stock(String name, int quantity, GlobalStock globalStock){
		this.name = name;
		this.quantity = quantity;
		this.globalStock = globalStock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void buy() {
		System.out.println("Stock [ Name: " + name + ",Quantity: " + quantity
				+ " ] bought");
		globalStock.Buy(this);
	}

	public void sell() {
		System.out.println("Stock [ Name: " + name + ",Quantity: " + quantity
				+ " ] sold");
		globalStock.Sell(this);
	}

	@Override
	public String toString() {
		return "Stock [ Name: " + name + ",Quantity: " + quantity +"]";
	}
}
