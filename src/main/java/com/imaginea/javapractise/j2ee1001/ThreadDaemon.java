package j2ee1001;

public class ThreadDaemon extends Thread {

	public void run() {
	    synchronized (this) 
	    {
	      try {
	    	  wait();
	    	  } catch (InterruptedException ie){}
	  }
	    }
	  public static void main(String[] args) {
		  ThreadDaemon a1 = new ThreadDaemon(); a1.setDaemon(true);
	    long startTime = System.currentTimeMillis();
	    a1.start();  //
	    System.out.print(System.currentTimeMillis() - startTime + ",");
	}
	  }


/*
 * The a1 thread is a daemon thread; so the program can run to completion even if thread a1 is still running, 
 * waiting or sleeping. The notify method is never invoked on thread a1. If thread a1 were not a daemon thread, 
 * then the program would wait forever. However, the program will run to completion without waiting for a1.*/

