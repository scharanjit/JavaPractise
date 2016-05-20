/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsr;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Charanjit.Singh
 */
public class NewClass extends Thread {

    public static Resoruce c = new Resoruce();

    public static void main(String[] args) {
        Thread t = new Thread(new NewClass());
        t.start();
        Thread t2 = new Thread(new NewClass());
        t2.start();
    }

    public void run() {

        System.out.println("Hi");
        try {
            meth1();
        } catch (InterruptedException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        meth2();
    }

    public void meth1() throws InterruptedException {
        synchronized (c) {
            System.out.println("Hi");
            c.wait(10000000);

        }
    }

    public void meth2() {
        synchronized (c) {
            System.out.println("Hi");

        }
    }

}
