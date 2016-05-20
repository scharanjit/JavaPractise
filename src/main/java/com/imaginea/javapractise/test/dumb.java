/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

/**
 *
 * @author Charanjit.Singh
 */
public interface dumb {
    
    public static void fun(){}
    
    public default void fun1(){}
    
    public void fun2();  //abstract
    
}
