package OCJPChap9;
//To put a thread in wait state, it shud be in try /catch or it shud throw Interrupted Exception
//if we throwing or try catching, then thread shud be synchronized


public class TT_9 {

	public static synchronized void main(String[] args) throws InterruptedException //throws InterruptedException 
	{
		Thread t = new Thread();
		t.start();
		System.out.print("X");
		//synchronized (t) {
			t.wait(10000);
			t.sleep(10);
		//}
		
		System.out.print("Y");
	}

}


//why it throws exception at run time bec we added  throws InterruptedException  
//main method is synchronized but not the thread
//t shud be synchronized  .//...likr uncomment the synch blocks