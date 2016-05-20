package OCJPChap9;

public class _9ThreadStates {

}
/*5 states
 * New :- This is the state the thread is in after the Thread instance has been
		  created, but the start() method has not been invoked on the thread. It is
		  a live Thread object, but not yet a thread of execution. At this point, the
		 thread is considered not alive.
 * 
 *Runnable:- This is the state a thread is in when it's eligible to run, but the
			scheduler has not selected it to be the running thread. A thread first enters
			the runnable state when the start() method is invoked, but a thread can
			also return to the runnable state after either running or coming back from a
			blocked, waiting, or sleeping state. When the thread is in the runnable state,
			it is considered alive.
 * 
 * Running :- This is the state thread is in when the thread scheduler selects it (from the runnable pool) to
			be the currently executing process. A thread can transition out of a running
			state for several reasons, including because "the thread scheduler felt like it."
			We'll look at those other reasons shortly. Note that in Figure 9-2, there are
			several ways to get to the runnable state, but only one way to get to the running
			state: the scheduler chooses a thread from the runnable pool.
 * \						Waiting/blocking(ALIVE)
 * 							\/			^
				New(NOT ALIVE)--> Runnable<---> Running---> Dead
				
				
				
				
 * Waiting/blocked/sleeping:-- This is the state a thread is in when it's not
eligible to run. Okay, so this is really three states combined into one,
but they all have one thing in common: the thread is still alive, but is
currently not eligible to run. In other words, it is not runnable, but it might
return to a runnable state later if a particular event occurs. A thread may be
blocked waiting for a resource (like I/O or an object's lock), in which case the
event that sends it back to runnable is the availability of the resource—for
example, if data comes in through the input stream the thread code is reading
from, or if the object's lock suddenly becomes available. A thread may be
sleeping because the thread's run code tells it to sleep for some period of time,
in which case the event that sends it back to runnable is that it wakes up
because its sleep time has expired. Or the thread may be waiting, because the
thread's run code causes it to wait, in which case the event that sends it back
to runnable is that another thread sends a notification that it may no longer
be necessary for the thread to wait.


to wake up waiting thread ...we suppose to use notify()
 * 
 *Dead A thread is considered dead when its run() method completes. It
may still be a viable Thread object, but it is no longer a separate thread of
execution. Once a thread is dead, it can never be brought back to life! (The
whole "I see dead threads" thing.) If you invoke start() on a dead Thread
instance, you'll get a runtime (not compiler) exception. And it probably
doesn't take a rocket scientist to tell you that if a thread is dead, it is no
longer considered to be alive. 


*/
