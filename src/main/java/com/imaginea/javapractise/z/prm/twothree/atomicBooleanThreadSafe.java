/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z.prm.twothree;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 *
 * @author Charanjit.Singh
 */
public class atomicBooleanThreadSafe {

    static boolean initialized = false;
    static private AtomicBoolean myBoolean = new AtomicBoolean(false);

    public static void main(String[] args) {
//This is not thread-safe. You can fix it by using AtomicBoolean:
        if (!initialized) {
            initialize();
            initialized = true;

        }

        if (myBoolean.compareAndSet(false, true)) {
            initialize();
        } else {
        }
    }

    public static void initialize() {
    }
}
