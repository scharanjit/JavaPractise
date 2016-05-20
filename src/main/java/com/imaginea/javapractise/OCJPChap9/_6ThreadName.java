package OCJPChap9;

	class NameRunnable implements Runnable {
		public void run() 
		{
			System.out.println("NameRunnable running");
			System.out.println("Run by "+ Thread.currentThread().getName());
		}
	}
	
	public class _6ThreadName 
	{
		public static void main (String [] args) {
			NameRunnable nr = new NameRunnable();
			Thread t = new Thread(nr);
			t.setName("Fred");
			t.start();
		}
	}