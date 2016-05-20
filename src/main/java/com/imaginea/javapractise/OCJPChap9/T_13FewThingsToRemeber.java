package OCJPChap9;
///A thread can acquire more than one lock ...how?
//using synchronized 
public class T_13FewThingsToRemeber {

}

/*
 *  Only methods (or blocks) can be synchronized, not variables or classes
 *  
 *  Each object has just one lock.
 *  
 *  Not all methods in a class need to be synchronized. A class can have both
	synchronized and non-synchronized methods.
	
 *	If two threads are about to execute a synchronized method in a class, and
	both threads are using the same instance of the class to invoke the method,
	only one thread at a time will be able to execute the method. The other
	thread will need to wait until the first one finishes its method call. In other
	words, once a thread acquires the lock on an object, no other thread can
	enter any of the synchronized methods in that class (for that object).
	If a class has both synchronized and non-synchronized methods, multiple
	threads can still access the class's non-synchronized methods! If you have
	methods that don't access the data you're trying to protect, then you don't
	need to synchronize them. Synchronization can cause a hit in some cases (or
	even deadlock if used incorrectly), so you should be careful not to overuse it.
	
 *	If a thread goes to sleep, it holds any locks it has�it doesn't release them.
 *
 *	A thread can acquire more than one lock. For example, a thread can enter a
	synchronized method, thus acquiring a lock, and then immediately invoke
	a synchronized method on a different object, thus acquiring that lock as
	well. As the stack unwinds, locks are released again. Also, if a thread acquires
	a lock and then attempts to call a synchronized method on that same
	object, no problem. The JVM knows that this thread already has the lock for
	this object, so the thread is free to call other synchronized methods on the
	same object, using the lock the thread already has.
	
* You can synchronize a block of code rather than a method.
* 
* 
 class SyncTest
  {
	public void doStuff()
	 {
		System.out.println("not synchronized");
	synchronized(this)
	 {
		System.out.println("synchronized");
	}
	}
} 
 * 
 * 
 * */
 