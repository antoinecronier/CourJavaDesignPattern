package observer.copy;

public class ObserverPatternDemo {
  public static void main(String[] args) {
    RealSubject subject = new RealSubject();

    RealObserver obs1 = new RealObserver();
    subject.attach(obs1);

    subject.setFirstname("john");
  }
}
