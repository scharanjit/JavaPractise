/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imaginea.javapractise.JAVAPUZZLES2016;
//reolace Boolean with boolean
/**
 *
 * @author charanjits
 */
public class Elvis {
    //recursive class inititlazation
      public static final Elvis ELVIS =new Elvis();
      
      private Elvis(){
      }
      
      private static final Boolean LIVING= true; //too late
      private final Boolean alive= LIVING;
      public final Boolean lives(){
      return alive;
      }
    
      public static void main(String[] args) {
          System.out.println(ELVIS.lives() ?   //auto unboxing
                  "HOund Dog":"HeartBroken");
          
          
    }
}
