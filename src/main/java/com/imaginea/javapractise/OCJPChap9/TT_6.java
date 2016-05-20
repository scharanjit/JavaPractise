 package OCJPChap9;

public class TT_6 {

}

/*
 *Assume the following method is properly synchronized and called from a thread A on an object B:
wait(2000);

After calling this method, when will the thread A become a candidate to get another turn at
the CPU?

A. After object B is notified, or after two seconds
B. After the lock on B is released, or after two seconds--  // thread notify karooo
C. Two seconds after object B is notified					// once notified..thread will run...wait does not matter
D. Two seconds after lock B is released						// notify karoo

A is correct. Either of the two events will make the thread a candidate for running again.
B is incorrect because a waiting thread will not return to runnable when the lock is
released, unless a notification occurs.0--> v imp fact

 C is incorrect because the thread will become a
candidate immediately after notification. 
D is also incorrect because a thread will not come
out of a waiting pool just because a lock has been released. (Objective 4.4)
 * */
 