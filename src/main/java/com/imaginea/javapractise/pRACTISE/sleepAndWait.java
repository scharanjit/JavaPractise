package pRACTISE;

public class sleepAndWait {

}
/*sleep() is a method which is used to hold the process for few seconds or the
time you wanted but in case of wait() 
 * method thread goes in waiting state and it won�t come back automatically 
until we call the notify() or notifyAll().
 * 
 * 
 * synchronized(LOCK) {   
    Thread.sleep(1000); // LOCK is held
}

synchronized(LOCK) {   
    LOCK.wait(); // LOCK is not held
}



 * 
 * 
 * */
