package demo.command;

import java.util.Stack;

public class Invoker {

  private Stack<Command> history = new Stack<>();

  public void push(Command c) {
      history.push(c);
  }

  public Command pop() {
      return history.pop();
  }

  public boolean isEmpty() { return history.isEmpty(); }

  public void showHistory() {
    System.out.println("Invoker history");
    for (Command command : history) {
      System.out.println(command);
    }
  }
}
