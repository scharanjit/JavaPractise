package j2ee1001;

public class Thread_BgThread extends Thread {

	public void start()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i+"  ");
		}
	}
	
	public static void main(String[] args) {
		Thread_BgThread t = new Thread_BgThread();
		
		t.run();
	}
}
