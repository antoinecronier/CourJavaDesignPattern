package demo.observer;

public class ConcreteSubject extends Subject {

  private String name;
  private String data;

  public ConcreteSubject(String name) {
    this.name = name;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
    System.out.println(String.format("From %s", this.name));
    this.notifyObservers();
  }
}
