/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z.prm.twotwo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Charanjit.Singh
 */
public class deadLock implements Runnable {

    public Object A = 5;
    public Object B = 6;

    public static void main(String[] args) {
        Thread t = new Thread(new deadLock());
        t.start();
        Thread t2 = new Thread(new deadLock());
        t2.start();
    }

    public void run() {
        System.out.println("Inside Run");
//        for(int i=0;i<100;i++){

        try {
            meth1();
            meth();
        } catch (InterruptedException ex) {
            Logger.getLogger(deadLock.class.getName()).log(Level.SEVERE, null, ex);
        }
//        }

    }

    private void meth() throws InterruptedException {
        synchronized (A) {
            Thread.sleep(1000);
            System.out.println(" Inside A" + A);
            synchronized (B) {
                System.out.println("Inside B" + B);
            }
        }

    }

    private void meth1() throws InterruptedException {
        synchronized (B) {
            Thread.sleep(1000);
            System.out.println(" Inside B" + B);
            synchronized (A) {
                System.out.println("Inside A" + A);
            }
        }
    }
}
