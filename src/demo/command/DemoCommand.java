package demo.command;

public class DemoCommand {

  public static void main(String[] args) throws CloneNotSupportedException {
    Client client = new Client();
    Receiver receiver1 = new Receiver();
    receiver1.setId(10);
    receiver1.setData("hello");
    Receiver receiver2 = new Receiver();
    Receiver receiver3 = new Receiver();
    client.executeCommand(new ConcreteCommand(receiver1));
    client.executeCommand(new ConcreteCommand(receiver2));
    client.undo();
    client.executeCommand(new ConcreteCommand(receiver3));
    client.executeCommand(new ConcreteCommand(receiver3));

    client.showHistory();

    System.out.println("Current datas");
    System.out.println(String.format("Receiver1 %s", receiver1));
    System.out.println(String.format("Receiver2 %s", receiver2));
    System.out.println(String.format("Receiver3 %s", receiver3));
  }
}
