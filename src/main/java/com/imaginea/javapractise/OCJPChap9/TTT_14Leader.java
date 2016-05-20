package OCJPChap9;

public class TTT_14Leader implements Runnable 
{
	public static void main(String[] args)
	{
		Thread t = new Thread(new TTT_14Leader());
		t.start();
		System.out.print("m1 ");
		
			//t.join(); //--> compiler time error
		System.out.print("m2 ");
	}
	public void run() 
	{
		System.out.print("r1 ");
		System.out.print("r2 ");
	}
}

/*
A. Compilation fails
B. The output could be r1 r2 m1 m2
C. The output could be m1 m2 r1 r2
D. The output could be m1 r1 r2 m2
E. The output could be m1 r1 m2 r2
F. An exception is thrown at runtime


The join() must be placed in a try/catch block. If it were, answers B and
D would be correct. The join() causes the main thread to pause and join the end of the
other thread, meaning "m2" must come last.*/