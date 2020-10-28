package demo.singleton;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class MonSingleton {

  private MonSingleton() {
    task = new FutureTask<Boolean>(new Callable<Boolean>() {

      @Override
      public Boolean call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        return true;
      }
    });
  }

  private static MonSingleton INSTANCE = null;

  public static synchronized MonSingleton getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new MonSingleton();
    }
    return INSTANCE;
  }

  private final FutureTask<Boolean> task;
  private final ExecutorService executor = Executors.newFixedThreadPool(100);

  public Boolean execTask() throws InterruptedException, ExecutionException {
    executor.execute(this.task);
    executor.awaitTermination(1, TimeUnit.SECONDS);
    return this.task.get();
  }

}
