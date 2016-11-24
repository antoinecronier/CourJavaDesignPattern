package command;

import java.util.ArrayList;
import java.util.List;

public class GlobalStock {
	public List<Stock> stocks = new ArrayList<>();

	public void Buy(Stock stock){
		for (Stock stockItem : stocks) {
			if (stockItem.getName().equals(stock.getName())) {
				stockItem.setQuantity(stockItem.getQuantity() + stock.getQuantity());
				break;
			}
		}
	}

	public void Sell(Stock stock){
		for (Stock stockItem : stocks) {
			if (stockItem.getName().equals(stock.getName())) {
				stockItem.setQuantity(stockItem.getQuantity() - stock.getQuantity());
				break;
			}
		}
	}

	public void PrintStock(){
		for (Stock stock : stocks) {
			System.out.println(stock.toString());
		}
	}
}
