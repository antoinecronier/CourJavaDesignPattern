package demo.observer;

public class ConcreteObserver implements Observer {

  private String name;

  public ConcreteObserver(String name) {
    this.name = name;
  }

  @Override
  public void update() {
    System.out.println(String.format("\tFrom %s", this.name));
    System.out.println("\t\tConcreteObserver triggered");
  }
}
