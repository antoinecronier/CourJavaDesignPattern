package demo.command;

public abstract class Command {

  public abstract boolean execute() throws CloneNotSupportedException;

  public abstract boolean undo();
}
