package demo.singleton;

import java.util.concurrent.ExecutionException;

public class DemoSingleton {

  public static void main(String[] args) throws InterruptedException, ExecutionException {

    System.out.println("Normal class test 1");
    MonNonSingleton mns1 = new MonNonSingleton();
    System.out.println(String.format("MonNonSingleton test type 1 %s",mns1.execTask()));
    System.out.println(String.format("MonNonSingleton test type 1 %s",mns1.execTask()));

    System.out.println("Normal class test 2");
    System.out.println(String.format("MonNonSingleton test type 2  %s", new MonNonSingleton().execTask()));
    System.out.println(String.format("MonNonSingleton test type 2  %s", new MonNonSingleton().execTask()));

    System.out.println("Singleton test");
    System.out.println(String.format("MonSingleton %s", MonSingleton.getInstance().execTask()));
    System.out.println(String.format("MonSingleton %s", MonSingleton.getInstance().execTask()));
  }
}
