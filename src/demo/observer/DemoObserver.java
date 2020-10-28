package demo.observer;

public class DemoObserver {

  public static void main(String[] args) {
    ConcreteSubject s1 = new ConcreteSubject("s1");
    ConcreteSubject s2 = new ConcreteSubject("s2");

    Observer o1 = new ConcreteObserver("o1");
    Observer o2 = new ConcreteObserver("o2");
    Observer o3 = new ConcreteObserver("o3");

    s1.attach(o1);
    s1.attach(o2);
    s1.detach(o2);

    s2.attach(o2);
    s2.attach(o3);

    s1.setData("data s1");
    s2.setData("data s2");
  }
}
