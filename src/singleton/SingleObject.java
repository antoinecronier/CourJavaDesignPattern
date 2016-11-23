package singleton;

public class SingleObject {

	public static String ITEM = "toto";

	// create an object of SingleObject
	private static SingleObject instance;

	private static String locker;

	// make the constructor private so that this class cannot be
	// instantiated
	private SingleObject() {
	}

	// Get the only object available
	public static SingleObject getInstance() {
		synchronized (locker) {
			if (instance == null) {
				instance  = new SingleObject();
			}
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}
}
