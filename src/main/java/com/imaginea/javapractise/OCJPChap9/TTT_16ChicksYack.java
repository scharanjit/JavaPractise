package OCJPChap9;

class Chicks
{
	synchronized void yack(long id)
	{
		for(int x = 1; x < 3; x++) 
		{
			System.out.print(id + " ");
			Thread.yield();
		}
	}
}
public class TTT_16ChicksYack implements Runnable

{
	Chicks c;
	public static void main(String[] args)
	{
		new TTT_16ChicksYack().go();
	} 

	void go() 
	{
		c = new Chicks();
		new Thread(new TTT_16ChicksYack()).start();
		new Thread(new TTT_16ChicksYack()).start();
	}
	public void run() 
	{ //Chicks c= new Chicks();
		c.yack(Thread.currentThread().getId());
	}
}

/*Which are true? (Choose all that apply.)
A. Compilation fails
B. The output could be 4 4 2 3
C. The output could be 4 4 2 2
D. The output could be 4 4 4 2
E. The output could be 2 2 4 4
F. An exception is thrown at runtime
Answer:
 F is correct. When run() is invoked, it is with a new instance of ChicksYack and c has
not been assigned to an object. If c were static, then because yack is synchronized, answers
C and E would have been correct.*/