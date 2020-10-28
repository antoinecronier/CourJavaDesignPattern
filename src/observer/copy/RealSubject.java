package observer.copy;

public class RealSubject extends Subject {

  private long id;
  private String firstname;
  private String lastname;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
    this.notifyAllObservers();
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
    this.notifyAllObservers();
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
    this.notifyAllObservers();
  }
}
