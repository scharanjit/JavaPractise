package j2ee1001;

public  class ThreadMain implements Runnable{
	
	synchronized public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.print(i+"");
		} 
	}

	public static void main(String args[])
	{
		
		String name = "new thread";
		ThreadMain thread = new ThreadMain();
		Thread t = new Thread(thread);
		t.start();
	}
}
