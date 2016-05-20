package OCJPChap9;

public class TT_7 {

}

/*
 *Which are true?
 * 
 * 
 * A. The notifyAll() method must be called from a synchronized context ---yes
B. To call wait(), an object must own the lock on the thread			---No
C. The notify() method is defined in class java.lang.Thread				---Nopes...java.lang.object
D. When a thread is waiting as a result of wait(), it releases its lock  --Very correct..
E. The notify() method causes a thread to immediately release its lock  --no
F. The difference between notify() and notifyAll() is that notifyAll() notifies all --no
waiting threads, regardless of the object they're waiting on

A is correct because notifyAll() (and wait() and notify()) must be called from within
a synchronized context. 

D is a correct statement.

B is incorrect because to call wait(), the thread must own the lock on the object that
wait() is being invoked on, not the other way around. 

C is wrong because notify() is defined in java.lang.Object. 

E is wrong because notify() will not cause a thread to
release its locks. The thread can only release its locks by exiting the synchronized code.

F is wrong because notifyAll() notifies all the threads waiting on a particular locked object,
not all threads waiting on any object. 

*/