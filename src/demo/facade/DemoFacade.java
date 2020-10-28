package demo.facade;

import java.util.Arrays;
import java.util.List;

public class DemoFacade {

  public static void main(String[] args) {
    List<Facade> facades = Arrays.asList(new Class1(), new Class2());

    for (Facade facade : facades) {
      facade.doSmt();
    }
  }
}
