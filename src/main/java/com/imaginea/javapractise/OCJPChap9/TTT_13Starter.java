package OCJPChap9;

public class TTT_13Starter implements Runnable 
{
	void go(long id) 
	{
		System.out.println(id);
	}
	public static void main(String[] args) 
	{
		System.out.print(Thread.currentThread().getId() + " ");
		// insert code here
		// new TTT_13Starter().run();		//1:-
		// new TTT_13Starter().start();
		// new Thread(new TTT_13Starter());
		// new Thread(new TTT_13Starter()).run();
	new Thread(new TTT_13Starter()).start();
	}
	/*wat we nrmally do
	 * class_name u = new class_name();
	 * thread t = new thred(u);
	 * t.start();
	 * 
	 *short cut
	 *
	 *new thread(new class_name().start);
	 *now think & act
	 * */
	
	public void run()
	{ 
		go(Thread.currentThread().getId());
	}
}

/*When the five fragments are inserted, one at a time at line 9, which are true? (Choose all that apply.)
A. All five will compile
B. Only one might produce the output 4 4
C. Only one might produce the output 4 2
D. Exactly two might produce the output 4 4
E. Exactly two might produce the output 4 2
F. Exactly three might produce the output 4 4
G. Exactly three might produce the output 4 2

Answer:
 C and D are correct.
  
Fragment I doesn't start a new thread.
Fragment II doesn't compile.
Fragment III creates a new thread but doesn't start it. 
Fragment IV creates a new thread and invokes run() directly, but it doesn’t start the new thread. 
Fragment V creates and starts a new thread.*/