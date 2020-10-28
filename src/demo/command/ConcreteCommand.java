package demo.command;

public class ConcreteCommand extends Command {

  private Receiver receiver;
  private Receiver beforeExecute;

  public ConcreteCommand(final Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public boolean execute() throws CloneNotSupportedException {
    System.out.println("ConcreteCommand execute");
    this.beforeExecute = (Receiver) this.receiver.clone();
    if (this.receiver.getId() == 0 && this.receiver.getData() == null) {
      this.receiver.setId(1);
      this.receiver.setData("data");
    }

    return true;
  }

  @Override
  public boolean undo() {
    System.out.println("ConcreteCommand undo");
    this.receiver.setId(this.beforeExecute.getId());
    this.receiver.setData(this.beforeExecute.getData());
    return true;
  }

  @Override
  public String toString() {
    return "ConcreteCommand [receiver=" + receiver + "]";
  }
}
