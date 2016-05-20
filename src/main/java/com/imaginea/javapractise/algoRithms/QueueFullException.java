/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algoRithms;

/**
 *
 * @author Charanjit.Singh
 */
public class QueueFullException extends Exception {
  
     QueueFullException(String cap){
        
        System.out.println("Oueue is "+cap);
    }

    QueueFullException() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
