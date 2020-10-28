package demo.adapter;

public class DemoAdapter {

  public static void main(String[] args) {
    Target target = new Adapter();
    target.doSmt();
    Adapter.VERSION = 1;
    target.doSmt();
  }

}
