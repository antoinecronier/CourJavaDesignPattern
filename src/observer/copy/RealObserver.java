package observer.copy;

public class RealObserver extends Observer {

  @Override
  public void update() {
    System.out.println("Updated");
  }

}
