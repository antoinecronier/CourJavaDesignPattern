package demo.command;

public class Receiver implements Cloneable {

  private long id;
  private String data;

  // Action 1
  public long getId() {
    return id;
  }

  // Action 2
  public void setId(long id) {
    this.id = id;
  }

  // Action 3
  public String getData() {
    return data;
  }

  // Action 4
  public void setData(String data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "Receiver [id=" + id + ", data=" + data + "]";
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    Receiver result = new Receiver();
    result.setId(this.getId());
    result.setData(this.getData());
    return result;
  }
}
