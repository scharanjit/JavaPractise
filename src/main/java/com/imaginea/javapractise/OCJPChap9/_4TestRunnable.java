package OCJPChap9;

public class _4TestRunnable {
	
	/*
	 * Overloading constructors
	 * Thread()
	 *  Thread(Runnable target)
	 *  Thread(Runnable target, String name)
	 *  Thread(String name)
	 * */
	public static void main(String[] args) {
		_3ImplementRunnable r = new _3ImplementRunnable();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		//instatting thread class
	}

}
