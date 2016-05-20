package OCJPChap9;
//this program is showing deadlock now.....

//t11 thread call write method
//it acquied lock on resouce B
//after that thraed sleep for a sec....
//in this meantine ...2nd thread start....
//it acquires lock on resource A
//now write method waiting for resource A  bec read methos already acquires lock on it...
//same case happening for read method...so deadlock occur...programming nvr completes
//solution is change the order of acquiring locks on resouces
public class T_15DeadLockRisk implements Runnable {
	private static class Resource 
	{
		public int value;
	}
	private Resource resourceA = new Resource();
	private Resource resourceB = new Resource();
	public int read() 
	{
		synchronized(resourceA)  // May deadlock here
		{
			synchronized(resourceB) 
			{
				System.out.println(resourceB.value + resourceA.value);
				return resourceB.value + resourceA.value;

			}
		}
	}

	public void write(int a, int b) throws InterruptedException 
	{
		synchronized(resourceB) 
		{ // May deadlock here
			Thread.sleep(1000);
			synchronized(resourceA)
			{

				resourceA.value = a;
				resourceB.value = b;
				System.out.println(resourceA.value);
				System.out.println(resourceB.value);
			}
		}
	}


	public static void main(String[] args) {

		T_15DeadLockRisk t1 = new T_15DeadLockRisk();


		Thread t11 = new Thread(t1);
		Thread t22 = new Thread(t1);
		t11.setName("Fred");
		t22.setName("Bred");
		
		t11.start();
		t22.start();
		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		if (Thread.currentThread().getName().equals("Fred"))
		{
			try {
				write(5,7);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			read();
		}
	}


	/*
	 * Assume that read() is started by one thread and write() is started by another.
If there are two different threads that may read and write independently, there is a
risk of deadlock at line 8 or 16. The reader thread will have resourceA, the writer
thread will have resourceB, and both will get stuck waiting for the other.
		The preceding simple example is easy to fix; just swap the order of locking for
either the reader or the writer at lines 16 and 17 (or lines 8 and 9). More complex
deadlock situations can take a long time to figure out.
	 * 
	 * */

}