package abstractfactory.advanceuse;

import java.util.*;

import abstractfactory.Item;

public class DrawItem {

	private List<CombinedItem> items = new ArrayList<CombinedItem>();
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CombinedItem> getItems() {
		return items;
	}

	public void setItems(List<CombinedItem> items) {
		this.items = items;
	}

	public void print() {
		System.out.println(this.getName());
		for (CombinedItem combinedItem : items) {
			Item shape = (Item) combinedItem.getShape();
			Item color = (Item) combinedItem.getColor();
			System.out.println(shape.getName() + " " + color.getName());
		}
	}
}
