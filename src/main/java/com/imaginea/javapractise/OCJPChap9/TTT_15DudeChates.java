package OCJPChap9;

class Dudes 
{
	static long flag = 0;
	// insert code here
	//synchronized void chat(long id) {					//Fragment I
	void chat(long id) {							//Fragment II

		if(flag == 0) flag = id;
		for(int x = 1; x < 3; x++)
		{
			if(flag == id) System.out.print("yo ");
			else System.out.print("dude ");
		}
	}
}
public class TTT_15DudeChates implements Runnable 
{
	static Dudes d;
	public static void main(String[] args)
	{
		new TTT_15DudeChates().go();
	}
	void go()
	{
		d = new Dudes();
		new Thread(new TTT_15DudeChates()).start();
	
		new Thread(new TTT_15DudeChates()).start();
		
	}
	public void run()
	{
		d.chat(Thread.currentThread().getId());
		
	}
}

//LOOK...in the o/p...the first o/p will always be "yo"