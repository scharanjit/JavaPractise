/*
 The AtomicBoolean class is used to update a boolean value atomically i.e. 
only one thread can modify the boolean variable at a time. It provides two 
constructors, a parameterless one with default value as false and a constructor
with argument as initial boolean value.
 */
package z.prm.twothree;

/**
 *
 * @author Charanjit.Singh
 */
import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBooleanExample {
      @Copyright
    public static void main(String[] args) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        new Thread("T1") {
            public void run() {
                while (true) {
                    System.out.println(Thread.currentThread().getName()
                            + " Waiting for T2 to set Atomic variable to true. Current value is "
                            + atomicBoolean.get());
                    if (atomicBoolean.compareAndSet(true, false)) {
                        System.out.println("Finally I can die in peace!");
                        break;
                    }
                }
            }
        ;
        }.start();
		new Thread("T2") {
            public void run() {
                System.out.println(Thread.currentThread().getName() + atomicBoolean.get());
                System.out.println(Thread.currentThread().getName()
                        + " ---> is setting the variable to true ");
                atomicBoolean.set(true);
            }
        ;
    }

.start();
}
}
