package j2ee1001;

public class ThreadDocss implements Runnable {
	Thread t;
	ThreadDocss()
	{
		t= new Thread(this,"child");
		t.start();
	}
	@Override
	public /*synchronized*/ void run() {  //to remove run time exception// remove cmnt part of synchronized
		// TODO Auto-generated method stub
		System.out.println("child");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ThreadDocss();
		System.out.println("parent");
	}
}
