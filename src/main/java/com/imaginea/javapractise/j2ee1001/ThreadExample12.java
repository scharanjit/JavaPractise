package j2ee1001;
//Ailla most difficault...deamon ka chakar
// it can & cannot show run tim error -->   if synchronized used ..d.en definatly no error

public class ThreadExample12 extends Thread
{

	public void run()
	{

		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}

	public static void main(String[] args)
	{
		ThreadExample12 ex = new ThreadExample12();
		ex.setDaemon(true);
		ex.start();
		System.out.println("This will be printed");
	}
}
