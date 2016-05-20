/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.puzzles;

import org.junit.Test;

/**
 *
 * @author charanjits
 */

public class puzzle3 extends junit.framework.TestCase {

    int number;

    public void test() throws InterruptedException {
        number = 0;
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                assertEquals(2, number);
            }
        });

        number = 1;
        t.start();
        number++;
        t.join();
    }
    //it will always pass bec junit wont catch the error
    //solution use tear down method
}
