/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivy.orgearn.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Charanjit.Singh
 */
public class Threaddssd extends Thread {

    Object lock;
    static int i = 0;

    public Threaddssd(Object lock) {
        this.lock = lock;
    }

    public static void main(String[] args) {

        Object Obj = new Object();

        Threaddssd t1 = new Threaddssd(Obj);
        Threaddssd t2 = new Threaddssd(Obj);
        t1.setName("Even");
        t2.setName("Odd");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        while (i <= 10) {

            if (i % 2 == 0 & Thread.currentThread().getName().equals("Even")) {
                synchronized (lock) {
                    System.out.println("" + i + " " + Thread.currentThread().getName());
                    i++;
               

                try {
                    lock.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Threaddssd.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
            }

            if (i % 2 == 1 & Thread.currentThread().getName().equals("Odd")) {
                synchronized (lock) {
                    System.out.println("" + i + " " + Thread.currentThread().getName());
                    i++;
                
                lock.notify();
                }
            }
        }

    }

}
