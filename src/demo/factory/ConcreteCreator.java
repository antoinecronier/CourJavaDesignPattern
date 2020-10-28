package demo.factory;

public class ConcreteCreator implements Creator {

  @Override
  public Product createProduct(String criteria) {
    Product result = null;

    switch (criteria) {
    case "p1":
      result = new ConcretProduct1();
      break;

    default:
      result = new ConcretProduct2();
      break;
    }

    return result;
  }

}
