package OCJPChap7;

/*
	boolean equals (Object obj) 	Decides whether two objects are meaningfully equivalent.
	void finalize() 				Called by garbage collector when the garbage collector sees that
									the object cannot be referenced.
	int hashCode() 					Returns a hashcode int value for an object, so that the object can
									be used in Collection classes that use hashing, including HashTable,
									HashMap, and HashSet.
	final void notify() 			Wakes up a thread that is waiting for this object’s lock.
	final void notifyAll()		    Wakes up all threads that are waiting for this object’s lock.
	final void wait() 				Causes the current thread to wait until another thread calls
									notify() or notifyAll() on this object.
	String toString() 				Returns a “text representation” of the object.
*/

public class _1HardToRead 
{
	public static void main (String [] args)
	{
		_1HardToRead h = new _1HardToRead();
		System.out.println(h);
		
		_1HardToRead h1 = new _1HardToRead();
		System.out.println(h1);
	}
}