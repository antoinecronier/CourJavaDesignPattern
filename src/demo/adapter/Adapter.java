package demo.adapter;

public class Adapter implements Target {

  public static int VERSION = 2;
  private AdapteeV1 adapteeV1 = new AdapteeV1();
  private AdapteeV2 adapteeV2 = new AdapteeV2();

  @Override
  public void doSmt() {
    switch (VERSION) {
    case 1:
      adapteeV1.doSmt();
      break;

    case 2:
      adapteeV2.doSmt();
      break;
    }
  }
}
