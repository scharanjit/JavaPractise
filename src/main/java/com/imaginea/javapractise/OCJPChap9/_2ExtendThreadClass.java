package OCJPChap9;

import java.lang.Thread;

/*Two  ways to create a thread class
 * 
 * 1st is
 * Extend the java.lang.Thread class.
 Implement the Runnable interface.
 * */


//METHOD 1 extending Thread class
//The limitation with this approach (besides being a poor design choice in most
//cases) is that if you extend Thread, you can't extend anything else
public class _2ExtendThreadClass extends Thread {
	
	public void run()
	{
		
		System.out.println("Important job running in MyThread");
	}
	
	public void run(String s) {
		System.out.println("String in run is " + s);
		}
	
	public static void main(String[] args) {
		//Instantiating a Thread
		_2ExtendThreadClass t = new _2ExtendThreadClass();
		
		System.out.println("Hi");
		
		t.start();
		
		}
}

/*
 * The overloaded run(String s) method will be ignored by the
Thread class unless you call it yourself. The Thread class expects a run() method
with no arguments, and it will execute this method for you in a separate call stack
after the thread has been started. With a run(String s) method, the Thread
class won't call the method for you, and even if you call the method directly
yourself, execution won't happen in a new thread of execution with a separate
call stack. It will just happen in the same call stack as the code that you made the
call from, just like any other normal method call.*/