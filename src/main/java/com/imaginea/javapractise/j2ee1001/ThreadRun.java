package j2ee1001;


class AZ implements Runnable
{

	public void run()
	{
		// TODO Auto-generated method stub
		System.out.println("inside run");
	}
}
public class ThreadRun extends AZ{
	public static void main(String[] args) {
		new Thread(new AZ()).start();

		/*
		 * AZ a = new AZ();
		 * Thread t = new Thread(a);
		 * t.start();
		 * */
	}

}
