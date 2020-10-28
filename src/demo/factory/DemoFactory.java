package demo.factory;

import java.util.ArrayList;
import java.util.List;

public class DemoFactory {

  public static void main(String[] args) {
    Creator creator = new ConcreteCreator();

    List<Product> products = new ArrayList<Product>();
    products.add(creator.createProduct(""));
    products.add(creator.createProduct("p1"));
    products.add(creator.createProduct("p2"));
    products.add(creator.createProduct("test"));

    for (Product product : products) {
      product.doSmt();
    }
  }
}
