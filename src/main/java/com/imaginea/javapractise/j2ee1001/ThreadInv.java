package j2ee1001;

class ThreadInvoking extends Thread {
	  public void run() {System.out.print("A");}
	}
	public class ThreadInv {
	  public static void main (String[] args) {
		  ThreadInvoking a = new ThreadInvoking(); a.start();
	    try {
	      a.join();
	    } catch (InterruptedException ie) {ie.printStackTrace();}
	   a.start();  // 1
	}}

//invoking the start method on a thread that has already been started will generate an IllegalThreadStateException