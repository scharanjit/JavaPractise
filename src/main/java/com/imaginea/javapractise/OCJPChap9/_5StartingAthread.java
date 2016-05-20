package OCJPChap9;

class FooRunnable implements Runnable
{
	public FooRunnable() {
		System.out.println("Flow of control---2");
	}

	public FooRunnable(String Jhingha) {
		System.out.println("Flow of control---2.1");
	}
	public void run()
	{
		System.out.println("Flow of control---6");
		for(int x = 1; x < 6; x++) 
		{
			System.out.println("Runnable running");
		}
	}
}
public class _5StartingAthread {

	public static void main (String [] args) 
	{
		//Thread t = new Thread();
		//t.run(); // Legal, but does not start a new thread


		System.out.println("Flow of control---1");
		FooRunnable r = new FooRunnable();
		System.out.println("Flow of control---3");
		Thread t = new Thread(r);
		System.out.println("Flow of control---4");
		t.start();
		System.out.println("Flow of control---5 :P :P");
	}
}