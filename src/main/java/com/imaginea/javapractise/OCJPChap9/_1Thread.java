package OCJPChap9;
//READ AL>>>NO PINTS TO REMEBER>>EVERYTHING IMP
//In Java, "thread" means two different things:
//1.)An instance of class java.lang.Thread
//2.) A thread of execution
//An instance of Thread is just�an object. Like any other object in Java, it has
//variables and methods, and lives and dies on the heap.
/*
 a thread of execution is
an individual process (a "lightweight" process) that has its own call stack. In Java,
there is one thread per call stack�or, to think of it in reverse, one call stack per
thread. Even if you don't create any new threads in your program, threads are back
there running.
 *
 *
 *The difference between these two
types of threads (user and daemon) is that the JVM exits an application only when
all user threads are complete�the JVM doesn't care about letting daemon threads
complete, so once all user threads are complete, the JVM will shut down, regardless
of the state of any daemon threads.
 *
 *
 *
 *
start()
yield()
sleep()
run()
*/
 