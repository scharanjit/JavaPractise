	package OCJPChap9;
//QUITE SIMPLE
public class TT_1 {

}


/*
 *Runnable target = new MyRunnable();
Thread myThread = new Thread(target);
Which of the following classes can be used to create the target, so that the preceding code
compiles correctly?

 A. public class MyRunnable extends Runnable{public void run(){}}
B. public class MyRunnable extends Object{public void run(){}}
C. public class MyRunnable implements Runnable{public void run(){}}
D. public class MyRunnable implements Runnable{void run(){}}
E. public class MyRunnable implements Runnable{public void start(){}}
Answer:
 C is correct. The class implements the Runnable interface with a legal run() method.
 
A is incorrect because interfaces are implemented, not extended. B is incorrect because
even though the class has a valid public void run() method, it does not implement
the Runnable interface. D is incorrect because the run() method must be public. E is
incorrect because the method to implement is run(), not start().
 * 
 * */
 