package OCJPChap9;

// guess the o/p

public class TT_2 extends Thread
{
	public static void main(String [] args) 
	{
		TT_2 t = new TT_2();
		Thread x = new Thread(t);
		x.start();
	}
	public void run() 
	{
		for(int i=0;i<3;++i)
		{
			System.out.print(i + "..");
		} 
	}
}