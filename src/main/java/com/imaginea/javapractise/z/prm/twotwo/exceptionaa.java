/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package z.prm.twotwo;

/**
 *
 * @author Charanjit.Singh
 */
public class exceptionaa {
    public static void main(String[] args) {
        try{
            infinite();
        int cat=1;
        int meow=cat/0;
        }finally{
            System.out.println("Hila hila");
        }
    }

    private static void infinite() {
//        infinite();
    }
       /*
    Race Conditions

If two or more threads share an object, and more than one thread updates 
    variables in that shared object, race conditions may occur.

Imagine if thread A reads the variable count of a shared object into its CPU 
    cache. Imagine too, that thread B does the same, but into a different CPU 
    cache. Now thread A adds one to count, and thread B does the same. Now var1 
    has been incremented two times, once in each CPU cache.

If these increments had been carried out sequentially, the variable count would
    be been incremented twice and had the original value + 2 written back to main memory.

However, the two increments have been carried out concurrently without proper 
    synchronization. Regardless of which of thread A and B that writes its 
    updated version of count back to main memory, the updated value will only 
    be 1 higher than the original value, despite the two increments.

    Solution:- Synchronization
    */    
    
}
