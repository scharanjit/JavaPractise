package OCJPChap9;

	class NameRunnable1 implements Runnable {
	public void run() {
	for (int x = 1; x <= 4; x++) {
	System.out.println("Run by " + Thread.currentThread().getName() + ", x is " + x +" and the id is "+Thread.currentThread().getId());
	}
	}
	}
	public class _7MultipleThreads {
	public static void main(String [] args) {
	// Make one Runnable
	NameRunnable1 nr = new NameRunnable1();
	Thread one = new Thread(nr);
	Thread two = new Thread(nr);
	Thread three = new Thread(nr);
	one.setName("Fred");
	two.setName("Lucy");
	three.setName("Ricky");
	one.start();
	two.start();
	three.start();
	}
	}
	
	
	//everytime o/p is different :)...multiple thread based upon JVM mood