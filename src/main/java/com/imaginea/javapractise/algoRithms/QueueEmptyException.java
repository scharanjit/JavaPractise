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
class QueueEmptyException extends Exception {

    public QueueEmptyException(String _empty) {
        System.out.println("Queue is " +_empty);
    }
    
}
