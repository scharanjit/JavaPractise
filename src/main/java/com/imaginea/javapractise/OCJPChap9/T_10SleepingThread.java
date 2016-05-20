package OCJPChap9;

class NameRunnable2 implements Runnable {
	public void run() {
		for (int x = 1; x < 2; x++) {
			System.out.println("Run by "
					+ Thread.currentThread().getName());
			try {
				
				Thread.sleep(1000);
			} catch (InterruptedException ex) { }
		}
	}
}
public class T_10SleepingThread {
	public static void main (String [] args)  {
		// Make one Runnable
		NameRunnable2 nr = new NameRunnable2();
		Thread one = new Thread(nr);
		one.setName("Fred");
		Thread two = new Thread(nr);
		two.setName("Lucy");
		Thread three = new Thread(nr);
		three.setName("Ricky");
		one.start();
		two.start();
		
		
		three.start();
	}
}