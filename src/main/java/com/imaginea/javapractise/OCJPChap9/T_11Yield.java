package OCJPChap9;

public class T_11Yield {

}

/*yield() is supposed to do is make the currently running thread head back to runnable to allow other threads of
the same priority to get their turn.

It makes already Running thread to runnable....so that...runnable thread can be in running state..

 *
 *The non-static join() method of class Thread lets one thread "join onto the end"
of another thread. If you have a thread B that can't do its work until another thread
A has completed its work, then you want thread B to "join" thread A. This means that
thread B will not become runnable until A has finished (and entered the dead state).
 *
 *make thread dpenedent on some other thread
 *
 *
 *
 *A call to sleep() Guaranteed to cause the current thread to stop executing
for at least the specified sleep duration (although it might be interrupted
before its specified time).

A call to yield() Not guaranteed to do much of anything, although
typically it will cause the currently running thread to move back to runnable
so that a thread of the same priority can have a chance.

A call to join() Guaranteed to cause the current thread to stop executing
until the thread it joins with (in other words, the thread it calls join()
on) completes, or if the thread it's trying to join with is not alive, however,
the current thread won't need to back out.
 *
 *
 */